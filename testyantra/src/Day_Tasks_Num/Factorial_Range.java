package Day_Tasks_Num;

public class Factorial_Range {

	public static void main(String[] args) {
		
	for(int i=1;i<=5;i++)
	{
		int fact=1;
		for(int j=1;j<=i;j++)
		{
			fact=fact*j;
		}
		System.out.println(i+" Factorial is "+fact);
	}
	}
}
