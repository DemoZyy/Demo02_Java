package MutiThreadTest;

class MyThread1 extends Thread{
	private String name;
	//通过构造方法配置name属性
	public MyThread1(String name){
		this.name=name;
	}
	//覆写run（）方法，作为线程的操作主体
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+"运行，i="+i);
		}
	}
	
}

public class ThreadDemo01 {
	public static void main(String args[]){
		//实例化对象
		MyThread1 mt1=new MyThread1("线程A");
		MyThread1 mt2=new MyThread1("线程B");
		//调用线程主体
		mt1.run();
		mt2.run();
		
	}
	

}


