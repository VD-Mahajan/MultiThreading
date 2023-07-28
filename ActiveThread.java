package multithreading;

class ActiveDemo extends Thread{
	public ActiveDemo(ThreadGroup tg,String name) {
		super(tg,name);
	}
	public void run() {
		try {
			Thread.currentThread().join();			
		}catch(InterruptedException ie) {
			
		}
	}
}

public class ActiveThread {
	
	public static void main(String[] args) throws InterruptedException{
		
		ThreadGroup g1 = new ThreadGroup("New G-1");
		ActiveDemo ad = new ActiveDemo(g1,"Thread-0");
		ad.start();
		
		Thread thread = Thread.currentThread();
		
		//currentThread method returns the currently running thread however we use object of any class .
		//It is a static method 
		System.out.println(ad.currentThread());  
		
		
		//getThreadGroup method returns the group name of thread object for which it belongs to.
		//It is non-static method
		System.out.println(ad.getThreadGroup());   
		
		System.out.println(g1.getParent());
		
	}

}
