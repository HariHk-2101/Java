package Day_Task_Pattern;

public class Pattern_27 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n + " ");
			}
			n--;
			System.out.println();
		}
	}
}
