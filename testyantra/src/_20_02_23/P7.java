package _20_02_23;


public class P7 {

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
