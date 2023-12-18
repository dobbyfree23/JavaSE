package section16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/* *****List
 * 컬렉션 프레임웍 중 하나 인터페이스로 순서가 있는 데이터 모음을 다루는 객체
 * 
 * 
 */
public class Collection02 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		//데이터저장하기          //인덱스번호
		list.add("피카츄");	//0
		list.add("라이츄");	//1
		list.add("파이리");	//2
		list.add("꼬부기");	//3
		list.add("버터풀");	//4
		list.add("야도란");	//5
		list.add("피죤투");	//6
		
	
		//저장된 데이터 특정 인덱스 값으로 얻어오기
		String pokemon = list.get(5);
		System.out.println("list[6]: " + pokemon);
		
		//리스트 크기 출력하기
		System.out.println("저장된 데이터 개수: "+ list.size());
		
		//저장된 데이터 인덱스 번호로 삭제하기
		list.remove(1);
		System.out.println("list[1]: " + list.get(1));
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list: " + list.get(i));
		}
		
		System.out.println("========================================");
		
		
		// 특정 인덱스 데이터 삽입
		list.add(4, "잠만보");
		
		// 향상된 for문
		for(String name: list) {
			System.out.println("name: " + name);
		}
		
		System.out.println("==============================");
		// LinkedList - 삽입 삭제 성능이 좋다.
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("메타몽");
		linkedList.add("이브이");
		
		for(String mon : linkedList) {
			System.out.println("mon: " + mon);
		}
		
		
		System.out.println("=============================");
		
		// ArrayList와 동일한 기능 + Thread Safe
		Vector<String> vec = new Vector<String>();
		vec.add("슈퍼맨");
		vec.add("배트맨");
		
		for(String hero : vec) {
			System.out.println("hero: " + hero);
		}
		
		
				
		
	}
}








