package com.shinhan.day16;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;

//자바 시험 리뷰
public class Prob4 {

	public static void main(String[] args) {

		Product[] prodList = {

				new Product("NT450R5E-K24S", 500000, "삼성전자"),

				new Product("15UD340-LX2CK", 400000, "LG전자"),

				new Product("G2-K3T32AV", 600000, "HP") };

		HashSet<Product> product_hs = makeHashSet(prodList, 500000);

		makeFile(product_hs);

		readFile();

	}

	private static HashSet<Product> makeHashSet(Product[] prodList, int price) {

		HashSet<Product> proSet = new HashSet<Product>();
		System.out.println("*특정 금액 이상의 상품 결과입니다.*****************");
		for (Product pro : prodList) {
			if (pro.getPrice() >= price) {
				proSet.add(pro);
				System.out.println(pro);
			}
		}

		return proSet;

	}

	private static void makeFile(HashSet<Product> resultList) {

		try (FileOutputStream fos = new FileOutputStream("src/data.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			for (Product obj : resultList) {
				oos.writeObject(obj);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void readFile() {

		System.out.println("*readFile결과입니다.*****************");
		try (FileInputStream fis = new FileInputStream("src/data.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			
			while (true) {
				Product pro =(Product) ois.readObject();
				System.out.println(pro);
			}

		} catch (EOFException e) {

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

//자바밖으로(file, network)보내기 , 가져오기 :Serializable필수
//객체를 일렬로 나열한다. 
class Product implements Serializable {

	private String model_name;

	private int price;

	private String company;

	public Product(String model_name, int price, String company) {

		super();

		this.model_name = model_name;

		this.price = price;

		this.company = company;

	}

	public String getModel_name() {

		return model_name;

	}

	public void setModel_name(String model_name) {

		this.model_name = model_name;

	}

	public int getPrice() {

		return price;

	}

	public void setPrice(int price) {

		this.price = price;

	}

	public String getCompany() {

		return company;

	}

	public void setCompany(String company) {

		this.company = company;

	}

	@Override

	public String toString() {

		return "Product [model_name=" + model_name + ", price=" + price

				+ ", company=" + company + "]";

	}

}