package concurrency;

// extend Thread class and override run 
class A extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Hello");
			try { Thread.sleep(1000);}
			catch(Exception e) {}	
		}
		
	}
}

class B extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("World");
			try { Thread.sleep(1000);}
			catch(Exception e) {}	
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		B b = new B();
		
		a.start();
		b.start();

	}

}
