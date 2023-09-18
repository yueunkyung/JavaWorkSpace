package com.shinhan.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Review {

	public static void main(String[] args) {
		String fname = "src/com/shinhan\\day15/data.txt";
		printScore(fname);
	}


	private static void printScore(String fname) {
		try(
				FileReader fr = new FileReader(fname);
				BufferedReader br= new BufferedReader(fr);
				) {
			String row;			
			row = br.readLine();
			System.out.println(row.replaceAll("/", "\t")+"\t총점");
			
			while((row = br.readLine())!=null) {
				
				String[] datas = row.split("/");
				//stream이용
				int total = Arrays.stream(datas, 1, datas.length)
				.mapToInt(s->Integer.parseInt(s)).sum();
				
				//일반for
				int total2 = 0;				
				for(int i=1;i<datas.length;i++) {
					total2 +=Integer.parseInt(datas[i]);
				}
			
				System.out.println(row.replaceAll("/", "\t")+"\t"+total+"\t"+total2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void f3() {
		String fname = "scr/com/shinhan\\day15/Member.java";
		
		try(
				FileReader fr = new FileReader(fname);
				BufferedReader br= new BufferedReader(fr);
				) {
			String row;			
			while((row = br.readLine())!=null) {
				System.out.println(row);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void f2() {
		//IO : 자바로 들어가면 입력stream, 자바에서 나가면 출력stream
		InputStream is; FileInputStream fis;
		OutputStream os; FileOutputStream fos;
		FileReader fr; FileWriter fw;
		
		//보조스트림 : 라인당 읽기, 쓰기 가능
		BufferedReader br;
		BufferedWriter bw;		
	}

	private static void f1() {
		//List<Member> datas = new ArrayList<>();
		Set<Member> datas = new HashSet<>(); //중복없음(동일객체이면 add안됨), 순서없음
		datas.add(new Member("123","김5",10));
		datas.add(new Member("126","김3",20));
		datas.add(new Member("122","김1",30));
		datas.add(new Member("124","김3",50));
		datas.add(new Member("127","김4",40));
		datas.add(new Member("127","김4",40));
		datas.add(new Member("127","양",40));
		// 배열 : 생성 시 갯수가 정해져 있다. 변경불가
		// interface => Collection : List, Set, Map
		// ArrayList, LinkedList, Vector, HashSet, TreeSet(Sort한다)
		// HashMap, TreeMap(Sort한다)
		// FIFO : Queue interface, LinkedList class
		// LIFO : Stack

		//외부반복자 이용
		for(Member member:datas) {
			System.out.println(member);
		}
		System.out.println();
		System.out.println("-----내부반복자 이용------------------------------");
		//내부반복자 이용
		//Stream : data의 흐름(직진)
		long cnt = datas.stream()
		.distinct()
		.filter(m->m.getAge() > 30)
		//.forEach(m->System.out.println(m));
		.peek(m->System.out.println(m))
		.count();
		
		System.out.println(cnt);
		
	}

}
