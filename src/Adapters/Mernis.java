package Adapters;

import Entities.Gamer;

public class Mernis {
	
	public void check(Gamer gamer) {
		
	System.out.println("Mernisten doðrulandý  \n"
					  +"Ýsim : "+gamer.getFirstName()
					  +"\nSoyisim : "+gamer.getLastName()				
					  +"\nTC Numarasý : "+gamer.getIdNumber()				
					  +"\nYaþý : "+gamer.getAge());
		
	}
	

}
