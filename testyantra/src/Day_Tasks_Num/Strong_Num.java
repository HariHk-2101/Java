package Day_Tasks_Num;

public class Strong_Num {

	public static void main(String[] args) {
		
		int num=145;
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int d=num%10;
			
			int n=1;
			
			for(int i=1;i<=d;i++)
			{
				n*=i;
			}
			sum=sum+n;
			num/=10;
		}
		
		if(temp==sum)
		{
			System.out.println("Strong Num");
		}
		else
		{
			System.out.println("Not A strong Num");
		}
	}
}
