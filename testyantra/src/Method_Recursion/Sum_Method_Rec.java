package Method_Recursion;

public class Sum_Method_Rec {

	//Sum Of Natural numbers without Using  Scanner class
	public static int sum(int num)
	{
		if(num<=1)
		{
			return num;
		}
		else 
		{
			return num+sum(num-1);
		}
	}
	public static void main(String[] args) {
		
		int num=10;
		
		System.out.println("The sum of Natural Number "+sum(num));
	}
}


