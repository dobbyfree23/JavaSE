package section16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * 	Map 인터페이스는 키-값 쌍으로 데이터를 저장하는 자료구조이다.
 * 	키는 중복을 허용하지 않는다. 순서보장하지 않는다.
 * 	값은 중복을 허용한다.
 * 
 */

public class Collection04 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 데이터 저장하기
		map.put("Alice", 95);
		map.put("Bob", 82);
		map.put("David", 90);
		map.put("Son", 100);
		
		// map 값 가져오기
		int score = map.get("Alice");
		System.out.println("Alice Score: " + score);
		
		// 특정 키의 존재여부 확인
		if(map.containsKey("Son")) {
			System.out.println("Son Score: " + map.get("Son"));
		}
		
		
		// 전체 키값 가져오기
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println("Key: " + key);
			System.out.println("Value: " + value);
		}
		
		
		System.out.println("===========================");
		
		// 키값으로 데이터 삭제
		map.remove("David");
		
		// entrySet()
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry: entries) {
			System.out.println("entry Key: " + entry.getKey());
			System.out.println("entry Value: " + entry.getValue());
		}
		
	}

}







