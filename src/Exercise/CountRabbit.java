package Exercise;

public class CountRabbit {
	public static void main(String args[]){
		System.out.println("第一个月兔子对数是："+1);
		System.out.println("第二个月兔子对数是："+1);
		int i,f1=1,f2=1,f,M=24;
		for(i=3;i<=M;i++){
			f=f2;
			f2=f1+f2;
			f1=f;
			System.out.println("第"+i+"个月的兔子对数是："+f1);
		}
		
	}

}
