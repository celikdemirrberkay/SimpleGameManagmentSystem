package Adapters;

import Entities.Gamer;

public class Mernis {
	
	public void check(Gamer gamer) {
		
	System.out.println("Mernisten do�ruland�  \n"
					  +"�sim : "+gamer.getFirstName()
					  +"\nSoyisim : "+gamer.getLastName()				
					  +"\nTC Numaras� : "+gamer.getIdNumber()				
					  +"\nYa�� : "+gamer.getAge());
		
	}
	

}
