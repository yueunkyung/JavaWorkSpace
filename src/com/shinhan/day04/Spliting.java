package com.shinhan.day04;

public class Spliting {
	public static void main(String[] args) {
		Spliting p = new Spliting();
		String addr = "서울시,강남구,역삼동,삼성SDS멀티캠퍼스";
		String[] addrArr = p.split(addr, ',');
		System.out.println("배열 크기 : " + addrArr.length);
		for (int i = 0; i < addrArr.length; i++) {
			System.out.print(addrArr[i] + " ");
		}
	}

	public String[] split2(String str, char separator){
		char arr[]=str.toCharArray();
		int cnt=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==separator) {
				cnt+=1;
			}
		}
		
		String result[]=new String[cnt+1];
		int arr_cnt[]=new int[cnt+2];
		arr_cnt[0]=-1;
		arr_cnt[cnt+1]=arr.length;
		cnt=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==separator) {
				arr_cnt[cnt+1]=i;
				cnt+=1;
			}
		}
		for(int i=0;i<arr_cnt.length-1;i++) {
			result[i]=str.substring(arr_cnt[i]+1,arr_cnt[i+1]);
		}
		return result;
	}
	
	public String[] split(String str, char separator) {
		int cnt = 0;
		for(int i=0;i<str.length(); i++) {
			if(str.charAt(i)==separator) cnt++;
		}
		
		String[] result =new String[cnt+1]; //separator의 갯수+1만큼으로 생성
		
		char[] arr = str.toCharArray();
		int index = 0;
		String word = "";
		for(char ch:arr) {
			if(ch==separator) {
				result[index++] = word;
				word="";
				//index++;
			} else {
				word += ch;
			}
		}		
		result[index] = word;
		return result;		
	}
	
}