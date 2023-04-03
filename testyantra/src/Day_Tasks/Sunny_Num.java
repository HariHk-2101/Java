package Day_Tasks;

public class Sunny_Num {

	public static void main(String[] args) {
		
		int num=8;
		
		int sq=num+1;
		
		boolean flag=false;
		
		for(int i=1;i<num;i++)
		{
			if(i*i==sq)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Sunny Number");
		}
		else
		{
			System.out.println("Not Sunny Number..");
		}
	}
}
