
class Test {
	
	interface musicalInstument{
		public void sound();
		public void name();
	}
	
	public static void play() {
		//implement the interface using local class
		class Drum implements musicalInstument{

			@Override
			public void sound() {
				System.out.println("I make loud sound! please make you room sound proof!");
			}

			@Override
			public void name() {
				System.out.println("My name is Dummeo");
				
			}
			
		}
		Drum d1 = new Drum();
		d1.name();
		d1.sound();
		
		
		
		//implement the interface using anonymous class
		musicalInstument guitar = new musicalInstument() {
			@Override
			public void sound() {
				System.out.println("I can make sweet sound! but don't strumming always!");
			}

			@Override
			public void name() {
				System.out.println("I am yamaha-007");
				
			}
		};
		
		guitar.name();
		guitar.sound();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		play();

	}

}
