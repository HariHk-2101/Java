package Day_Task_Pattern;

public class Pattern_17 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}
