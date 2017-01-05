package MutiThreadTest;

class MyRunnable02 implements Runnable{
	//共有5张票
	private static int ticket=5;
	private String name;
	//通过构造方法配置name属性
	public MyRunnable02(String name){
		this.name=name;
	}
	// 覆写run()方法，作为线程 的操作主体
	public void run(){
		for(int i=1;i<=5;i++){
			if(this.ticket>0){
				System.out.println(name+"卖票：ticket ="+ticket--);
			}		
		}
	}
	
}

public class RunnableDemo02 {
	public static void main(String args[]){
		
		// 实例化对象
		MyRunnable02 myRunnable1=new MyRunnable02("线程1");
		MyRunnable02 myRunnable2=new MyRunnable02("线程2");
		MyRunnable02 myRunnable3=new MyRunnable02("线程3");
//		MyRunnable02 myRunnable2=new MyRunnable02();
//		MyRunnable02 myRunnable3=new MyRunnable02();
		// 实例化Thread类对象
		Thread thread1=new Thread(myRunnable1);
		Thread thread2=new Thread(myRunnable2);
		Thread thread3=new Thread(myRunnable3);
//		new Thread(myRunnable1).run() ;	// 调用线程主体
//		new Thread(myRunnable1).run() ;	// 调用线程主体
//		new Thread(myRunnable1).run() ;	// 调用线程主体
		
//		new Thread(myRunnable2).run() ;	// 调用线程主体
//		new Thread(myRunnable3).run() ;	// 调用线程主体
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
