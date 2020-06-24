package concurrency;

public class EnumType {
	
	public enum Day{
		Sunday,
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday;
	}
	private Day day;
	
	EnumType(Day day) {
		this.day = day;
	}
	
	/*The compiler automatically adds some special methods when it creates an enum. For example, 
	 *  they have a static values method that returns an array containing all of the values of the 
	 *  enum in the order they are declared. 
	 */
	public static void printEnum() {
		for (Day d : Day.values()) {
			System.out.println(d);
		}
		
	}
	
	public void workingDays() {
		switch(this.day) {
		case Friday:
			System.out.println("Hooraah! today is weekend!");
			break;
		case Saturday:
			System.out.println("check calender: Today may be weekend!");
			break;
		default:
			System.out.println("Oh no! Working day!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumType monday = new EnumType(Day.Monday);
		monday.workingDays();
		
		EnumType friday = new EnumType(Day.Friday);
		friday.workingDays();
		
		EnumType saturday = new EnumType(Day.Saturday);
		saturday.workingDays();
		
		System.out.println("\nPrint Enum Type!!");
		printEnum();
		

	}

}
