package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt(); //숫자 입력
		
		for(int i = 1; i <= num; i++) { //행이 입력된 숫자만큼 늘어남
			for(int j = 1; j <= i; j++) { //열이 행의 숫자만큼 늘어남
				System.out.print(i); //행의 숫자 출력
			}
			System.out.println(); //줄바꿈
		}
		
		sc.close();
	}
}
