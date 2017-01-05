package MutiThreadTest;

class MyThread2 extends Thread{
	public int t=0;
	public void run(){
		System.out.println(++t);
	}

}

class MyRunnable implements Runnable{
	public int t=0;
	public void run(){
		System.out.println(++t);
	}
}

public class ThreadTest {

	public static void main(String args[]) throws Exception{
//		MyThread2 mythread=new MyThread2();
		Thread myrunnable=new Thread(new MyRunnable(),"Thread2");
//		for(int i=0;i<10;i++){
//			mythread.start();
//		}
//		try{
//			Thread.sleep(10000);
//		}
//		catch(InterruptedException e){
//			e.toString();
//		}
		for(int i=0;i<10;i++){
			myrunnable.start();
		}
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException e){
			e.toString();
		}
	}
}
