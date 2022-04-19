package com.javaex.practice03;

public class Ex06 {
	public static void main(String[] args) {
		
		int i = 1;
		
		while(true) {
			if(i <= 100) { //i가 100 이하일때
				if(i%5==0 && i%7==0) { //i가 5의 배수이고 7의 배수일때 출력
					System.out.println(i);
				}
				i++;
			} else { //i가 100 초과일때
				break;
			}
		}
	}
}
