package Day_Tasks_Num;

public class Composite_Num {

	public static void main(String[] args) {
		
		int num=6;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println("Composite");
		}
		else
		{
			System.out.println("Not Composite");
		}
	}
}
