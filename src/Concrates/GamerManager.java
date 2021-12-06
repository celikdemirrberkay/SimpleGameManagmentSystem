package Concrates;

import Entities.Gamer;

public class GamerManager {
	
	

	public void register(Gamer gamer) {
		
	System.out.println("Kayýt olundu . Hoþgeldin "+gamer.getFirstName() +" !");	

	}
	
	public void delete(Gamer gamer) {
		
		System.out.println("Kayýt silindi . Aramýzdan ayrýldýðýn için üzgünüz "+gamer.getFirstName()+" :(");
		
	}
	
	public void update(Gamer gamer) {
		
		System.out.println("Kayýt güncellendi . ");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


}
