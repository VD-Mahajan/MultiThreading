package multithreading;

class ThreadDemo extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getId());
			try {
				this.sleep(100);				
			}catch(InterruptedException ie) {
				
			}
		}
	}
}

public class MyThread {

	static Thread main = null;	
	
	public static void main(String[] args) throws InterruptedException{
		
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		
		main = Thread.currentThread();
		
		for(int i=0;i<10;i++) {
			System.out.println(main.getId());
			main.sleep(100);
		}
		
	}
}
