package section03;
/*
 * 연산자(Operator)
 * 	프로그램에서 데이터를 처리하여 산출하는것을 연산이라 한다.
 * 	연산에 사용되는 표시나 기호를 연산자(operator)라고 한다.
 * 
 * 1. 산술연산자
 * 	+, -, *(곱하기), /(나누기), %(나머지값)
 * 
 */
public class Operator01 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		
		// 두수의 합	정수 + 정수 => 정수
		int sum = num1 + num2;
		System.out.println("sum: " + sum);
		
		// 문자열 + 숫자 => 문자열 ('+' 연결연산자)
		String sumStr = num1 + "+" + num2 + "=" + sum;
		System.out.println("sumStr: " + sumStr);
		
		// 두수의 곱
		int multiply = num1 * num2;
		System.out.println("multiply: " + multiply);
		
		// 두수 나누기
		int divide = num1 / num2;
		System.out.println("divide: " + divide);
		
		// 두수의 나눈 나머지값
		int result = 19 % 3;
		System.out.println("result: " + result);
		
	}

}














