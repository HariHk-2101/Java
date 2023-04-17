package Day_Tasks_Num;

public class Palindrome_Num {

	public static void main(String[] args) {
		
		int num=121;
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int d=num%10;
			rev=rev*10+d;
			num/=10;
		}
		if(temp==rev)
		{
		System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
