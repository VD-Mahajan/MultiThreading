package multithreading;

class MyThreadGroup implements Runnable{
	static ThreadGroup tg =null;
	public void run() {
		System.out.println(tg.getParent());
	}
}

public class RunnableThreadGroupDemo {
	
	public static void main(String[] args) {
		
		ThreadGroup parentThread = new ThreadGroup("India");
		MyThreadGroup obj1 = new MyThreadGroup();
		MyThreadGroup obj2 = new MyThreadGroup();
		
		Thread t1 = new Thread(parentThread,obj1,"Maharashtra");
		Thread t2 = new Thread(parentThread,obj2,"Goa");
		t1.start();
		t2.start();
		
		
		ThreadGroup childThread = new ThreadGroup(parentThread,"Pakistan");
		MyThreadGroup.tg = childThread;
		MyThreadGroup obj3 = new MyThreadGroup();
		MyThreadGroup obj4 = new MyThreadGroup();
		
		
		Thread t3 = new Thread(childThread,obj3,"Karachi");
		Thread t4 = new Thread(childThread,obj4,"Lahore");
		t3.start();
		t4.start();
		
		
		ThreadGroup childThread2 = new ThreadGroup(childThread,"BanglaDesh");
		System.err.println(childThread2.getParent());
		
		
	}
}
