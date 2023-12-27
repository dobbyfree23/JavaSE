package section19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class IO09 {
	
	public static void main(String[] args) {
		
		String path = "./upload/pokemon.obj";
		
		try(
				FileInputStream fis = new FileInputStream(path);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
			){
			
			PokeMonVO pokeMonVO = (PokeMonVO) ois.readObject();
			System.out.println("pokemon.obj -> pokeMonVO 객체화!");
			System.out.println("No. " + pokeMonVO.getNo());
			System.out.println("Name: " + pokeMonVO.getName());
			System.out.println("Type: " + pokeMonVO.getType());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
