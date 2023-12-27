package section19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * ObjectInputStream / ObjectOutputStream
 * 	객체를 바이트 스트림으로 읽고 쓰는 클래스
 * 
 * Serializable
 * 	객체를 직렬화하기 위한 인터페이스, 객체를 일련의 byte로 변환하는것을 말한다.
 * 
 */
public class IO08 {
	
	public static void main(String[] args) {
		
		PokeMonVO pokeMonVO = new PokeMonVO();
		
		pokeMonVO.setNo("025");
		pokeMonVO.setName("피카츄");
		pokeMonVO.setType("전기");
		
		String path = "./upload/pokemon.obj";
		
		try(
				FileOutputStream fos = new FileOutputStream(path);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
			) {
			
			oos.writeObject(pokeMonVO);
			
			System.out.println("pokeMonVO -> pokemon.obj 파일로 저장!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}








