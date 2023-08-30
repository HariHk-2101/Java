package Day_Tasks_Num;

public class Sunny_Num {

	public static void main(String[] args) {
		
		int num=15;
		
		int sq=num+1;
		
		boolean flag=false;
		
		int temp=1;
		for(int i=1;i<num;i++)
		{
			if(i*i==sq)
			{
				temp=i*i;
			}
		}
		if(temp==sq)
		{
			System.out.println("Sunny Number");
		}
		else
		{
			System.out.println("Not Sunny Number..");
		}
	}
}
