package section15;

public class JavaLang07 {
	
	public static void main(String[] args) {
		
		Integer num1 = 10;
		Integer num2 = 1000;
		
		// copareTo 
		if(num1.compareTo(num2) > 0) {
			System.out.println("num1이 num2 보다 크다.");
		} else if(num1.compareTo(num2) == 0) {
			System.out.println("num1과 num2는 같다.");
		} else {
			System.out.println("num1은 num2 보다 작다.");
		}
		
		System.out.println("INT MAX: " + Integer.MAX_VALUE);
		System.out.println("INT MIN: " + Integer.MIN_VALUE);
		
		System.out.println("Double MAX: " + Double.MAX_VALUE);
		System.out.println("Double MIN: " + Double.MIN_VALUE);
		
		System.out.println("문자입니까? " + Character.isLetter('A'));
		System.out.println("숫자입니까? " + Character.isDigit('5'));
		System.out.println("공백입니까? " + Character.isWhitespace(' '));
		
		
	}

}







