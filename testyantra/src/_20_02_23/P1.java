package _20_02_23;

public class P1 {

	public static void circle()
	{
		double d=23.5;
		double p=3.14;
		System.out.println("Your Area Of Circle is "+p*d*d);
	}
	
	public static void  circum()
	{
		double r=13.34;
		double p=3.14;
		
		System.out.println("Your Circumference Of Circle is "+2*p*r);
	}
	
	public static void  greatest()
	{
		int a=45;
		int b=20;
		int c=55;

		
		if(a>b && a>b &&a>c)
		{
			System.out.println(a+ " is Greatest Number...");
		}
		else if( b>c)
		{
			System.out.println(b+ " is Greatest Number...");
		}
		else
		{
			System.out.println(c+ " is Greatest Number...");
		}
	}
	
	
	
	public static void main(String[] args) {
		circle();
		circum();
		greatest();
	}
}
