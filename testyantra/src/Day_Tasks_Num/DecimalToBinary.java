package Day_Tasks_Num;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int n=20;
		
		String s="";
		while(n>0)
		{
			int d=n%2;
			
			s=d+s;
			
			n/=2;
			
			
		}
		System.out.println(s);
	}
}
