package Day_Tasks;

public class Arm_Strong_Num {
	
	public static void main(String[] args) {
		
		int num=153;
		int count=0;
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			count++;
			num/=10;
		}
		num=temp;
		
		while(num>0)
		{
			int d=num%10;
			int n=1;
			
			for(int i=1;i<=count;i++)
			{
				n*=d;
			}
			
			sum+=n;
			num/=10;
		}
		if(temp==sum)
		{
			System.out.println("Arm Strong Num");
		}
		else
		{
			System.out.println("Not Arm Strong Num");
		}
	}
}
