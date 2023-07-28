package multithreading;

import java.util.concurrent.*;

class ThreadPool implements Runnable{
	int num;
	ThreadPool(int num){
		this.num=num;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Task start : "+num);
//		dailyTask();
		System.out.println(Thread.currentThread().getName()+" Task end   : "+num);
	}
	void dailyTask(){
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ie) {
			
		}
	}
}

public class ThreadPoolDemo {
	public static void main(String[] args) throws InterruptedException{
		//Pool-1
		ExecutorService es1 = Executors.newFixedThreadPool(3);     //create fixed amount of threads in thread pool
		for(int i=1;i<=5;i++) {
			ThreadPool tp = new ThreadPool(i);
			es1.execute(tp);
		}
		Thread.sleep(2000);
		System.out.println("\n\n");
		//Pool-2
		ExecutorService es2 = Executors.newCachedThreadPool();     //create fixed amount of threads in thread pool
		for(int i=1;i<=5;i++) {
			ThreadPool tp = new ThreadPool(i);
			es2.execute(tp);
		}
		Thread.sleep(2000);
		System.out.println("\n\n");
		
		ExecutorService es3 = Executors.newSingleThreadExecutor();     //create fixed amount of threads in thread pool
		for(int i=1;i<=5;i++) {
			ThreadPool tp = new ThreadPool(i);
			es3.execute(tp);
		}
		
		es1.shutdown();
		es2.shutdown();
		es3.shutdown();
		
	}
}
