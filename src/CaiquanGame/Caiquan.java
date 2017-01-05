package CaiquanGame;

import java.util.Random;
import java.util.Scanner;


public class Caiquan {

	
	Person person;//甲方
    Computer computer;//乙方
    int count;//对战次数
    
	public static void main(String[] args){
		Show();
		Start();		
	}
	

	public static void Show(){
        System.out.println("-----------欢迎进入游戏世界-----------");
        System.out.println("\t******************");
        System.out.println("\t**    猜拳,开始    **");
        System.out.println("\t******************");
        System.out.println("\n出拳规则：0.剪刀 1.石头 2.布");
        System.out.print("请选择对方角色：(0.刘备 1.孙权 2.曹操):");//选择对方角色
        Scanner input=new Scanner(System.in);
        int num = input.nextInt();
        switch(num){
            case 0:
                System.out.println("你选择了  刘备对战");
                break;
            case 1:
                System.out.println("你选择了  孙权对战");
                break;
            case 2:
                System.out.println("你选择了  曹操对战");
                break;
        }
	}

     public static void Start(){
    	 System.out.println("要开始吗？(y/n)");
    	 Scanner input=new Scanner(System.in);
    	 String answer = input.next();
    	 int perFirst;//用户出拳
         int compFirst;//计算机出拳
         int count = 0;	
 		Person person = new Person();
		Computer computer = new Computer();
         while(answer.equals("y")){
        	 perFirst = person.showFirst();
        	 compFirst = computer.showFirst();
        	 if((perFirst==0&&compFirst==0)||(perFirst==1&&compFirst==1)||(perFirst==2&&compFirst==2)){
        		 System.out.println("平局");
        		 
        	 }else if((perFirst == 1&&compFirst == 2) || (perFirst == 1&&compFirst == 0) || (perFirst == 2&&compFirst == 1)){
        		 System.out.println("你赢啦");
        		 person.score++; 
        	 }
        	 count++;
        	 System.out.println("是否进入下一轮（y/n）:  ");      	
        	 answer = input.next();
         } 	 
     }

}


class Computer {
	Scanner input = new Scanner(System.in);
	//计算机出拳方法
	Random random = new Random();
    public int showFirst(){
    	int num = random.nextInt(3);
    	switch(num){
    	case 0:
    		System.out.println("你出拳: 剪刀");
    		break;
    	case 1:
    		System.out.println("你出拳: 石头");
    		break;
    	case 2:
    		System.out.println("你出拳: 布");
    		break;
    	default:
    		System.out.println("输入错误，请重新输入：");
    	}
    	return num;
    }
}


class Person {
	String name;
    int score;

	Scanner input = new Scanner(System.in);
	//人的出拳方法
    public int showFirst(){
    	System.out.println("请出拳：0.剪刀 1.石头 2.布 请输入相应数字:");
    	int num = input.nextInt();
    	switch(num){
    	case 0:
    		System.out.println("你出拳: 剪刀");
    		break;
    	case 2:
    		System.out.println("你出拳: 石头");
    		break;
    	case 3:
    		System.out.println("你出拳: 布");
    		break;
    	default:
    		System.out.println("输入错误，请重新输入：");
    	}
    	return num;
    }

}

