package Exercise;

import java.util.*;

public class MatrixTest {
	public static void main(String[] args){
		
	Scanner s=new Scanner(System.in);
	int i,j;
	int sum=0;
	int array[][]=new int[3][3];
	System.out.println("请输入9个整数：");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			array[i][j]=s.nextInt();
		}
	}
	System.out.println("3*3的矩阵是：");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			System.out.print(array[i][j]+" \t");
		}
		System.out.println();
	}

	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			if(i==j){
				sum+=array[i][j];
			}
			
		}
	}
	System.out.println("3*3的矩阵的对角线元素之和是："+sum);
 }

}
