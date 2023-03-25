package Method_Recursion;

public class primeMethodRec {

	      static int num=5;
	      static int i=2;
	      static int half=num/2+1;
	      
	    public static void main(String[] args) {
		
		if(isPrime(num)==true)
		{
			System.out.println("The Given Number "+num+" Is Prime Number");
			isPrime(num++);
		}
		else
		{
			System.out.println("The Given Number "+num+" Is not Prime Number");
			isPrime(num++);
		}
	}
		
     	public static boolean isPrime(int num)
		{
     		if(num<=20)
     		{
			if(i==half)
			{
				return true;
			}
			if(num%i==0)
			{
				return false;
			}
			else
			{
				i++;
				return(isPrime(num));
			}
		 }
     		return true;
		}
}
