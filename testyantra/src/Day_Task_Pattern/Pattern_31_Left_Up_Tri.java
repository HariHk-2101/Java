package Day_Task_Pattern;

public class Pattern_31_Left_Up_Tri {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
