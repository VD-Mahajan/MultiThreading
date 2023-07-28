package multithreading;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class MyThreadPool implements Runnable{
	public void run() {
		System.out.println("In run");
	}
}

public class ThreapPoolExecutorDemo {
	public static void main(String[] args) {
		MyThreadPool obj = new MyThreadPool();
		ThreadPoolExecutor tpe =(ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		tpe.execute(obj);
	}
}
