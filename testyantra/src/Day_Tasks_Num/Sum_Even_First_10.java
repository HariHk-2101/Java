package Day_Tasks_Num;

public class Sum_Even_First_10 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				
			}
		}
		System.out.println(sum);
	}
}
