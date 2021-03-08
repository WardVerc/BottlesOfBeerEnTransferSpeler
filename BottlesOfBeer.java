public class BottlesOfBeer {
	public static void main (String[] args) {
		int numOfBeers = 100;
		String woord = "flaskes";
		
		while (numOfBeers > 0) {
		
		if (numOfBeers == 1) {
			woord = "flaske";
			System.out.println("Der es nog moar "+ numOfBeers + " " + woord + " op dienen tuug");
			System.out.println("Goade gij hem pakke of pakke kik em?");
			numOfBeers = numOfBeers - 1;
		 } else if (numOfBeers < 10) {
			 System.out.println("Dfrhd stoan "+ numOfBeers + " "+ woord + " opdrrn tuug.. Domnique! Geft er maa ne kier ientjse oas ge wilt merciiii");
			 numOfBeers = numOfBeers - 1;
		 } else if (numOfBeers < 50) {
			 System.out.println("Der stoan "+ numOfBeers + " "+ woord + " op diene kluute tuug.. Kgoa der maa toch nog iene pakke");
			 System.out.println("Zet da moar op mijn rekening ze, tes iene van maa");
			 numOfBeers = numOfBeers - 1;
		    } else if (numOfBeers < 80) {
			 System.out.println("Jalo, ze goan precies goe noar binne");
			 System.out.println("Der stoan nog "+ numOfBeers + " "+ woord + " op Nico zijn uufd");
			 numOfBeers = numOfBeers - 1;
		    } else if (numOfBeers < 101) {
				System.out.println("Der staan "+ numOfBeers + " " + woord + " op den toog.");
			numOfBeers = numOfBeers - 1;
		    } 
		
		
		
		
		
		 
		}
			if (numOfBeers == 0) {
			System.out.println("De flaskes zijn op, MILJAARDE!");
			}
		
	}
}