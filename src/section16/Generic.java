package section16;
/*
 * 제네릭(Generic)
 * 	코드의 재사용성과 타입 안정성을 높이기 위해 도입된 기능
 * 	클래스나 메서드를 일반적인 타입 대신 실제 타입으로 지정할 수 있게 한다.
 * 
 * 
 */
public class Generic {
	
	public static void main(String[] args) {
		
		MyClass<String> myClass1 = new MyClass<String>();
		myClass1.setData("Hello, Generic!");
		
		String data = myClass1.getData();
		System.out.println("data: " + data);
		
		
		MyClass<Object> myClass2 = new MyClass<Object>();
		myClass2.setData("Nice to meet you!");
		
		String data2 = (String) myClass2.getData();
		System.out.println("data2: " + data2);
		
		myClass2.setData(1);
		Integer data3 = (Integer) myClass2.getData();
		System.out.println("data3: " + data3);
		
	}

}

















