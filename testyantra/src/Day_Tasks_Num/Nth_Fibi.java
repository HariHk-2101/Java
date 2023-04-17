package Day_Tasks_Num;

public class Nth_Fibi {

	public static void main(String[] args) {
		
		int num=13;
		
		int a=0,b=1,c=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num==i)
			{
				System.out.println("Nth Fibi Is "+a);
			}
			
			c=a+b;
			a=b;
			b=c;
		}
	}
}
