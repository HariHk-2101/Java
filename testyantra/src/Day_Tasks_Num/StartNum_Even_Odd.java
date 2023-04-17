package Day_Tasks_Num;

public class StartNum_Even_Odd {

	public static void main(String[] args) {
		int num=939;
		
		while(num>9)
		{
		    num/=10;
		}
		if(num%2==0)
		{
			System.out.println("Starts With Even");
		}
		else
		{
			System.out.println("Starts With Odd");
		}
	}
}
