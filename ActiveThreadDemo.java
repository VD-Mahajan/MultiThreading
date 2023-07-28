package multithreading;


class MyThreadActive extends Thread{
	public MyThreadActive(ThreadGroup g,String name) {
		super(g,name);
	}

	public synchronized void run() {
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		
		try {
			this.sleep(3000);
		}catch(InterruptedException ie) {
			
		}
	}
}
public class ActiveThreadDemo {
	public static void main(String[] args) throws InterruptedException{
		ThreadGroup tg = new ThreadGroup("Group-1");
		
		MyThreadActive obj1 = new MyThreadActive(tg,"child-1");
		obj1.start();
		MyThreadActive obj2 = new MyThreadActive(tg,"child-2");
		obj2.start();
		
		ThreadGroup main = tg.getParent();
		System.out.println(main.activeGroupCount());  //activeGroupCount method return the active number of thread groups running under specified ThreadGroup
		
		Thread.sleep(2000);
		
		System.out.println(tg.activeCount());
		
	}
}
