package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt(); //숫자 입력
		int result = 1; //결과값 변수
		
		for(int i=1; i<=num; i++) { //입력된 숫자만큼 result의 값과 곱해서 넣음
			result = result * i;
		}
		
		System.out.println("결과값: " + result);
		
		sc.close();
	}
}
