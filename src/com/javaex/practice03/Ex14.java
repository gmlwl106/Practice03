package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt(); //숫자입력
		int sum = 0; //합계변수
		
		for(int i=1; i<=num; i++) {
			if(i == num) { //마지막 숫자에는 '+'기호 안붙임
				System.out.print(i);
			} else {
				System.out.print(i + "+");
			}
			sum += i;
		}
		System.out.println();
		System.out.println("합계: " + sum);
		
		sc.close();
	}
}
