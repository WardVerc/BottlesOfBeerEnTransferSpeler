public class TransferSpeler {
	public static void main(String[] args) {
	
		String[] wordListOne = {"lange", "smalle", "breeje", "kleine", "dikke", "magere"};
		String[] wordListTwo = {"krachtige", "sterke", "vinnige", "dribbelende", "snelle", "werkende", "verdedigende", "lopende", "kopbalsterke"};
		String[] wordListThree = {"koppende", "van ver trappende", "vrije trap scorende", "torenhoge", "polyvalente", "egoistische", "passende"};
	
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("We zoeken ne" + " " + phrase + " " + "speler.");
	
	}
}