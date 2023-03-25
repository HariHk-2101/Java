package Method_Recursion;


public class Product_Method_rec{

	//Product 
	public static int pro(int num)
	{
		if(num<=1)
		{
			return num;
		}
		else 
		{
			return (num*pro(num-1));
		}
	}
	public static void main(String[] args) {
		
     	int num=10;
		
		System.out.println("The Product First 10 Natural Number "+pro(num));
	}
}
