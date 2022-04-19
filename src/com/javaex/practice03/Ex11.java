package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt(); //숫자 입력
		int result = 0; //결과값 변수
		
		while(true) {
			if(num%2 == 0) { //숫자가 짝수일때
				for(int i=1; i<=num; i++) { //입력받은 숫자만큼 반복
					if(i%2 == 0) { //짝수인 수를 합함
						result += i;
					} else {
						continue;
					}
				}
				break; //입력된 숫자만큼 계산이 됐으면 반복 중단
			} else { //숫자가 홀수일때
				for(int i=1; i<=num; i++) { //입력받은 숫자만큼 반복
					if(i%2 != 0) { //홀수인 수를 합함
						result += i;
					} else {
						continue;
					}
				}
				break; //입력된 숫자만큼 계산이 됐으면 반복 중단
			}
		}
		
		System.out.println("결과값: " + result);
		
		sc.close();
	}
}
