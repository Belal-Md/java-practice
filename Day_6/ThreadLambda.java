package concurrency;

public class ThreadLambda {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*
		 * Runnable obj1 = ()-> { for(int i = 0; i<5; i++) {
		 * 
		 * System.out.println("Hello"); try { Thread.sleep(1000);} catch(Exception e) {}
		 * } };
		 * 
		 * 
		 * Runnable obj2 = ()-> { for(int i = 0; i<5; i++) {
		 * System.out.println("World"); try { Thread.sleep(1000);} catch(Exception e) {}
		 * 
		 * }//end for };//end lambda
		 * 
		 * 
		 * 
		 * (new Thread(obj1)).start(); (new Thread(obj2)).start();
		 */
		
		Thread t1 = new Thread(()->
		{
			for(int i = 0; i<5; i++) {
				System.out.println("Hello");
				try { Thread.sleep(1000);} catch(Exception e) {}
				
			}
			
		});
		
		Thread t2 = new Thread(() ->
		{
			for(int i = 0; i<5; i++) {
				System.out.println("World");
				try { Thread.sleep(1000);} catch(Exception e) {}
				
			}
			
		}/*,"Thread_name"*/);
		
		/* 
		 *Set and get Thread name
		 *setName() and getName() function
		 */
		
		// we can get the priority
		//10: highest 1:lowest by default threads has same priority
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		//currentThread function use to get current thread
		
		t1.start(); 
		t2.start();
		
		System.out.println(t1.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("End");
		

	}//main method

}
