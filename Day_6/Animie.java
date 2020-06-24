package concurrency;

public enum Animie {
	
	OnePunchMan("Saitama",5.0),
	DragonBall("Goku", 5.0),
	Naruto("Naruto Uzumaki", 5.0),
	Bleach("Ichigo", 4.0),
	FMA("Edward Elric",4.5),
	FairyTail("Natsu", 4.5);
	
	private final String  mainCharacter;
	private final double rating;
	
	/*
	 * The constructor for an enum type must be package-private or private access.
	 *  It automatically creates the constants that are defined at the beginning 
	 *  of the enum body. You cannot invoke an enum constructor yourself.
	 */
	Animie(String mainCharacter, double rating){
		this.mainCharacter = mainCharacter;
		this.rating = rating;
	}
	
	private String getName() { return mainCharacter;}
	private double getRating() {return rating;}
	
	public static void rate() {
		for(Animie a : Animie.values()) {
			if(a.getRating() == 5.0) 
				System.out.println(a.getName()+" is Awesome!");
			else if(a.getRating() >= 3.0 && a.getRating()<5.0) 
				System.out.println(a.getName()+" is Good!");
			else
				System.out.println("Need to be rated!");
		}
	}
	
	public static void main(String[] args) {
		Animie.rate();
	}


}
