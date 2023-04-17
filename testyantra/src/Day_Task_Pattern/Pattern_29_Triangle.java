package Day_Task_Pattern;

public class Pattern_29_Triangle{

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
