package com.javaex.practice03;

public class Ex05 {
	public static void main(String[] args) {
		
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i=i+1;
		} //i가 5가 되면 flag를 false로 만든뒤 5를 출력하고 while문이 중단됨
	}
}
/* 결과
1
2
3
4
*/