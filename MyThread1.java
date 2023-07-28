package multithreading;

class ThreadDemo1 extends Thread{	
	ThreadDemo1(String name){
		super(name);
	}	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				this.sleep(100);				
			}catch(InterruptedException ie) {
				
			}
		}
	}
}
class ThreadDemo2 extends Thread{
	public void run () {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				this.sleep(100);				
			}catch(InterruptedException ie) {
				
			}
		}

	}
}
public class MyThread1 {
	
	public static void main(String[] args) throws InterruptedException{
		
		ThreadDemo1 t1 = new ThreadDemo1("ThreadDemo-1");
		t1.start();
		
		ThreadDemo2 t2 = new ThreadDemo2();
		t2.start();
		
	}
}
