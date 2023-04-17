package Day_Task_Pattern;

public class Pattern_24 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==2&&j==3||i==3&&j==2||i==3&&j==4||i==4&&j==3)
				{
					System.out.print("  ");
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
