package Multithread;

public class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	public void run(){
	   System.out.println("my thread is running");
	   for(int i=0;i<5;i++){
		   for(long k=0;k<100000000;k++);
		   System.out.println(this.getName()+":"+i);
	   }
	}
	public static void main(String[]args){
		Thread t1=new MyThread("qa");
		Thread t2=new MyThread("bb");
		t1.start();
		t2.start();
	}

}
