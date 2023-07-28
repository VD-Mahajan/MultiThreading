package multithreading;

class MyThreadJoin extends Thread {
	
	static Thread main = null;
	
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("In "+getName());
			try {
				main.join(100,999999);
			}catch(InterruptedException ie) {
				
			}
		}
	}
}

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException{
		
		MyThreadJoin.main=Thread.currentThread();   //return current thread 
		
		MyThreadJoin mtj = new MyThreadJoin();
		mtj.start();
		
		for(int i=0;i<20;i++) {
			mtj.join(100,0);
			System.out.println("In "+Thread.currentThread().getName());
		}
	}
}
