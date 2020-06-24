package concurrency;

public class ThreadAnonymus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using anonymous class
		Runnable obj1 = new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i<5; i++) {
					System.out.println("Hello");
					try { Thread.sleep(1000);}
					catch(Exception e) {}	
				}
				
			}
			
		};
		
		Runnable obj2 = new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i<5; i++) {
					System.out.println("World");
					try { Thread.sleep(1000);}
					catch(Exception e) {}	
				}	
			}	
		};
		
		/*
		 * Thread t1 = new Thread(obj1); Thread t2 = new Thread(obj2);
		 * t1.start();
		 * t2.start();
		 */
		//or create Anonymous object
		(new Thread(obj1)).start();
		(new Thread(obj2)).start();
		

	}

}
