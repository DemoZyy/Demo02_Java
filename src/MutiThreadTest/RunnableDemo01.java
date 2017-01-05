package MutiThreadTest;

//实现Runnable接口，作为线程的实现类
class MyRunnable01 implements Runnable{
	private String name;
	//通过构造方法配置name属性
	public MyRunnable01(String name){
		this.name=name;
	}
	//覆写run（）方法，作为线程的操作主体
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+"运行，i="+i);
		}
	}
}

public class RunnableDemo01 {
	public static void main(String args[]){
		// 实例化对象
		MyRunnable01 myRunnable1=new MyRunnable01("线程A");
		MyRunnable01 myRunnable2=new MyRunnable01("线程B");
		// 实例化Thread类对象
		Thread thread1=new Thread(myRunnable1);
		Thread thread2=new Thread(myRunnable2);
		// 启动多线程
		thread1.start();
		thread2.start();
		
	}

}
