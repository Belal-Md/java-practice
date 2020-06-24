package concurrency;

class A1 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Hello");
			try { Thread.sleep(1000);}
			catch(Exception e) {}	
		}
		
	}
}

class B1 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("World");
			try { Thread.sleep(1000);}
			catch(Exception e) {}	
		}
	}
}

public class ThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Runnable a = new A1(); Runnable b = new B1();
		 * 
		 * Thread t1 = new Thread(a); Thread t2 = new Thread(b);
		 * 
		 * t1.start(); t2.start();
		 */
		
		//anonymous object
		(new Thread(new A1())).start();
		(new Thread(new B1())).start();
		


		
		

	}

}
