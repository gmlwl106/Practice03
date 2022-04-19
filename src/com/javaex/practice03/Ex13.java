package com.javaex.practice03;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt(); //숫자입력
		int sum = 0; //합계 변수
		
		for(int i=1; i<=num; i++) { //1부터 입력한 숫자까지 합한 것을 sum에 넣음
			sum += i;
		}
		
		System.out.println("합계: " + sum);
		
		sc.close();
	}
}
