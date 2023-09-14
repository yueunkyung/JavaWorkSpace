package ch06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
int a= 10;
	static {
		info = company + "-" + model; // + a;
		}
	
	void f1() {
		System.out.println(info);
		System.out.println(a);
	}
	static void f2() {
		//System.out.println(a);
	}
}