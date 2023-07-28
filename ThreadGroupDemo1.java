package multithreading;

class MyThreadGroup1 extends Thread{
//	static Thread gg=null;
	public MyThreadGroup1(ThreadGroup tg,String name) {
		super(tg,name);
	}
	
	public void run() {
//		this.suspend();
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().getName());
	}
	
}
public class ThreadGroupDemo1 {

	public static void main(String[] args) {
		
		ThreadGroup tg1 = new ThreadGroup("Mahajan");           //Parent ThreadGroup
		ThreadGroup tg2 = new ThreadGroup(tg1,"Vishal");		//Child ThreadGroup 
		
		MyThreadGroup1 g1 = new MyThreadGroup1(tg1,"Electric");
		g1.start();

		MyThreadGroup1 g2 = new MyThreadGroup1(tg2,"Machinery");
		g2.start();
		System.err.println("Parent is : "+tg2.getParent());
		//System.out.println(Thread.currentThread().getThreadGroup());
		//System.out.println(Thread.currentThread().getName());
	}
}
