package Day_Task_Pattern;

public class Pattern_15 {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==1)
				{
					System.out.print("5 ");
				}
				else
				{
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
}
