package com.javaex.practice03;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt(); //숫자 입력
		
		for(int i=num; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<num-1; i++) {
			for(int j=0; j<=i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
