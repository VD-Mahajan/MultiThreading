package multithreading;
import java.util.Scanner;
class NewException extends Exception{
	public  NewException() {
		
	}
	public NewException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}

class Demo1 extends Thread{
	Scanner sc = new Scanner(System.in);
	int i;
	public void run(){
		try {
		System.out.println("Enter the number : ");
	
		i = sc.nextInt();			
		if(i>10) {
			throw new NewException("\nIllegalArgumentException");
		}
		}catch(NewException n) {
			
			System.err.println("Exception in  "+Thread.currentThread().getName()+n.getMessage());
		}
		
	}
}
public class ThreadGroupDemo {

	public static void main(String[] args){
		
		Demo1 t1 = new Demo1();
		t1.start();
		
	}

}
