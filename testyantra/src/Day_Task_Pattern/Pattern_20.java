package Day_Task_Pattern;

public class Pattern_20 {

	public static void main(String[] args) 
	{
		char ch='z';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch-- +" ");
			}
			System.out.println();
		}
	}
}
