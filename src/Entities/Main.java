package Entities;

import Adapters.Mernis;
import Concrates.GamerManager;
import Concrates.OfferManager;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1111111,20,"Berkay","Çelikdemir","Brk","Erkek");
			
		Mernis mernis = new Mernis();
		mernis.check(gamer);
	
		System.out.println("********************************************");	
		
		GamerManager gamermanager = new GamerManager();
		gamermanager.register(gamer);
		gamermanager.update(gamer);
		gamermanager.delete(gamer);
	
		System.out.println("********************************************");	
		
		OfferManager offermanager = new OfferManager();
		Offer offer = new Offer();
		offermanager.add(offer,gamer);
		
	}

}
