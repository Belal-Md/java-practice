import java.util.ArrayList;
import java.util.List;

class Instrument{
	private String name;
	private String company;
	
	Instrument(String name, String company){
		this.name = name;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
public class lambda {
	
	interface playInstrument{
		void play(String name, Instrument p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Rick", "Morty", "Summer"};
		int index = 0;
		
		List <Instrument> l1 = new ArrayList<Instrument>();
		l1.add(new Instrument("Drum","yamaha"));
		l1.add(new Instrument("guitar","jackson"));
		l1.add(new Instrument("keyboard","ronald"));
		
		playInstrument player = (String nam, Instrument p ) -> System.out.println(nam +" playing "+ p.getName());
		for (Instrument i : l1) {
			player.play(name[index],i);
			index++;
		}
		
		
		
		

	}

}
