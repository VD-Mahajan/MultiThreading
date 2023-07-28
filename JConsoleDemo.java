package multithreading;

class MyThreadConsole implements Runnable{
	
	void doTask() {
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			
		}
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is Started .");
		doTask();
		System.out.println(Thread.currentThread().getName()+" is Ended .");
	}
}

public class JConsoleDemo {
	public static void main(String[] args) {
		MyThreadConsole obj = new MyThreadConsole();
		Thread t1 = new Thread(obj);
		t1.setName("Vishal");
		t1.start();
	}
}
