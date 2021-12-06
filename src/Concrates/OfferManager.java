package Concrates;

import Entities.Gamer;
import Entities.Offer;

public class OfferManager {
	
	public void add(Offer offer,Gamer gamer) {
		
		
		
		if(gamer.getAge()<18) {
			
			System.out.println("Kampanya uygulandý : "+offer.offerForKids);
			
		}
		
		else {
			
			System.out.println("Kampanya uygulandý : "+offer.offerForAdults);
	
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
