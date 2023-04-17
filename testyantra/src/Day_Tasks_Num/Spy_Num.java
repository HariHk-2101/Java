package Day_Tasks_Num;

public class Spy_Num {

	public static void main(String[] args) {
		
		int num=123;
		int sum=0;
		int prod=1;
		while(num>0)
		{
			int d=num%10;
			
			sum+=d;
			prod*=d;
			
			num/=10;
			
		}
		if(sum==prod)
		{
			System.out.println("Spy Num");
		}
		else
		{
			System.out.println("Not A Spy Num");
		}
	}
}
