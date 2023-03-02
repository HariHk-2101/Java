package _02_03_23;

public class PalindromeElements {
public static void main(String[] args) {
	

	int a[]= {101,20,303,40,50,60};
	boolean flag=false;
	
	for(int i=0;i<a.length;i++)
	{
		int n=a[i];
		int n1=n;
		
		int rev=0;
		
		while(n>0)
		{
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		
		if(n1==rev)
		{
			flag=true;
			System.out.println("palindrome elements are " +n1);
		}
	}
	if(flag==false)
		
	{
		System.out.println("no palindrome");
	}
}
}
