package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int money = 0;
		
		while(flag) {
			
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			int num = sc.nextInt();
			
			
			switch(num) {
				case 1: //예금
					System.out.print("예금액>");
					int deposit = sc.nextInt();
					money = money + deposit;
					break;
				case 2: //출금
					System.out.print("출금액>");
					int withdraw = sc.nextInt();
					money = money - withdraw;
					break;
				case 3: //잔고확인
					System.out.println("잔고액>" + money);
					break;
				case 4: //종료
					flag = false;
					break;
				default: //번호 오류
					System.out.println("다시입력해주세요");
					break;
			}
		}
		
		sc.close();
	}
}
