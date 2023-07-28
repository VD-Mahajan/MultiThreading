package multithreading;

class MyThreadYield extends Thread{
	static Thread main=null;
	public void run() {
		main.yield();
		for (int i=0;i<10;i++) {
			System.out.println("In Thread-0");
		}
	}
}

public class YieldDemo {
	
	public static void main(String[] args) {
		MyThreadYield.main = Thread.currentThread();
		MyThreadYield mty = new MyThreadYield();
		mty.start();
		//mty.yield();
		for (int i=0;i<10;i++) {
			System.out.println("In main");
		}
		
	}
}
