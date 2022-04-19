package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("\t[숫자맞추기게임 시작]");
		System.out.println("==================================");

		int num = 55; //숫자 설정
		while(true) {
			System.out.print(">>");
			int myNum = sc.nextInt();
			
			if(myNum > num) {
				System.out.println("더 낮게");
			} else if(myNum < num) {
				System.out.println("더 높게");
				
			} else if (myNum == num) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				char y_n = sc.next().charAt(0); //char형식 scanner
				
				if(y_n == 'y') {
					break; //게임 종료
				} else {
					continue; //계속하기
				}
			}
		}
		
		System.out.println("==================================");
		System.out.println("\t[숫자맞추기게임 종료]");
		System.out.println("==================================");
		
		sc.close();
	}
}
