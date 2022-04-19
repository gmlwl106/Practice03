package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt(); //숫자 입력
		int count = num / 5; //5의 배수의 개수 (5로 나눴을때의 몫)
		int sum = 0; //합계 변수
		
		for(int i=1; i<=count; i++) { //i를 count만큼 반복해서 5의 배수의 합계를 구함
			sum = sum + (i*5);
		}
		
		System.out.println("5의배수의 개수: " + count);
		System.out.println("5의배수의 합 : " + sum);
		
		sc.close();
	}
}
