package Day_Tasks_Num;

public class Avg_Range {

	public static void main(String[] args) {
		
    int count=0;
    int sum=0;
	for(int i=1;i<=5;i++)
	{
		count++;
		sum=sum+i;
	}
	System.out.println(sum/count);
	}
}
