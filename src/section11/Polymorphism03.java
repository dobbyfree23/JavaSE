package section11;
/*
 * ***** instanceof 연산자
 * 	객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부를 확인하는 연산자
 * 
 * 
 * 
 */

import java.util.Scanner;

import section11.access2.Ade;
import section11.access2.Coffee;
import section11.access2.Drink;

public class Polymorphism03 {
	
	public static void main(String[] args) {
		
		Scanner scan = null;
		
		while(true) {
			int inputNum = 0;
			scan = new Scanner(System.in);
			System.out.println("1) 코카콜라 Zero");
			System.out.println("2) 클래식밀크커피");
			System.out.println("0) 종료");
			System.out.println("음료를 선택하세요 >>>");
			
			inputNum = scan.nextInt();
			
			if(inputNum == 0) break;
			
			Drink drink = getDrink(inputNum);
			
			if(drink instanceof Ade) {
				Ade ade = (Ade) drink;
				System.out.println("제로콜라 입니까? " + ade.isZero);
			} else if(drink instanceof Coffee) {
				Coffee coffee = (Coffee) drink;
				System.out.println("디카페인 입니까? " + coffee.isDecaf);
			}
			
			System.out.println();
			
		}
	}	// 메엔메소드 끝
	
	public static Drink getDrink(int inputNum) {
		
		Drink drink = null;
		if(inputNum == 1) {
			drink = new Ade();
		} else if (inputNum == 2) {
			drink = new Coffee();
		}
		
		return drink;
		
	}

}

















