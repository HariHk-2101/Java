package _18_02_23;

public class ReturnType {
	
//	 public static int add(double a , double b)
//	 {
//		return (int)(a+b);
//		 
//	 }
// public static void main(String[] args) {
//	
//	System.out.println(add(20 ,40));
//	System.out.println(add(20.5,60.0));
//	System.out.println(add(50l ,60l));
//	System.out.println(add('A','C'));
////	System.out.println(add("Hello" , "Bye"));
//	
//	
//	
//	 
// }
	
	
	public static boolean isPrime(int i)
	{  
	
		int temp=1;
		
		for(int s=2;s<i;s++)
		{
			if(i%s==0)
			{
				temp=0;
				
			}
		}
		
		if(temp==1)
		{
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	
	public static long factorial(int fact)
	{
		
		
		return fact;
	}
	public static void main(String[] args) {
		System.out.println(isPrime(7));
	}
}
