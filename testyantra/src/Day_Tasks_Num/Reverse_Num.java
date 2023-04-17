package Day_Tasks_Num;

public class Reverse_Num {

	public static void main(String[] args) {
		
	
	int num=123;
	int rev=0;
	System.out.println("Before reverse "+num);
	while(num>0)
	{
		int d=num%10;
		rev=rev*10+d;
		num/=10;	
	}
	System.out.println("After Reverse "+rev);
	}
}
