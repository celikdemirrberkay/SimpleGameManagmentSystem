package Concrates;

import Entities.Gamer;

public class GamerManager {
	
	

	public void register(Gamer gamer) {
		
	System.out.println("Kay�t olundu . Ho�geldin "+gamer.getFirstName() +" !");	

	}
	
	public void delete(Gamer gamer) {
		
		System.out.println("Kay�t silindi . Aram�zdan ayr�ld���n i�in �zg�n�z "+gamer.getFirstName()+" :(");
		
	}
	
	public void update(Gamer gamer) {
		
		System.out.println("Kay�t g�ncellendi . ");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


}
