package Day_Tasks;

public class Auto_Morphic_Number {

	public static void main(String[] args) {
		int num=6;
		int sq=num*num;
		boolean flag=false;
		while(num>0)
		{
			if(num%10 == sq%10)
			{
				flag=true;
			}
			else
			{
				break;
			}
			
			num/=10;
			sq/=10;
		}
		
		if(flag==true)
		{
			System.out.println("Auto Morphic Number");
		}
		else
		{
			System.out.println("Not Auto Morphic Number");
		}
	}
}
