package Day_Tasks_Num;

public class GCD_2_Number {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=5;
		int gcd=0;
		
		for(int i=1;i<=num1&&i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("The GCD Of "+num1+" & "+num2+" is "+gcd);
	}
}
