package Exercise;

public class PrimeNumber {
	public static void main(String args[]){
		int count=0;
		boolean bool=false;
		for(int i=101;i<=200;i+=2){

			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					bool=false;
					break;
				}else{
					bool=true;
				}
			}
			if(bool==true){
				System.out.println(i);
//				++count;
				count++;
		 }

		}
		System.out.println("素数个数："+count);
	}	
}
