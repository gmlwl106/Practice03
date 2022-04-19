package com.javaex.practice03;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt(); //숫자 입력
		
		for(int i=1; i<=num; i++) { //입력 받은 숫자만큼 반복
			if(num%i == 0) { //입력받은 숫자와 i의 나머지가 0이면 i(약수) 출력
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
