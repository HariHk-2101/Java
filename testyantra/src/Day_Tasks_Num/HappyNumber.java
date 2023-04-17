package Day_Tasks_Num;

public class HappyNumber {

	public static void main(String[] args) {
		
		int num=12;
	
		while(true)
		{
			int sum=0;
			while(num!=0)
			{
				int d=num%10;
				sum=sum+d*d;
				num=num/10;
			}
			num=sum;
			if(num==1)
			{
				System.out.println("Happy");
				break;
			}
			else if(num==4)
			{
				System.out.println("Not Happy");
				break;
			}
		}
		
	}
}
