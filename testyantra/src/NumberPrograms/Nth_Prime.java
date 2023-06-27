package NumberPrograms;

public class Nth_Prime {

	public static void main(String[] args) {
		int key=3;
		int count1=0;
		for(int i=0;count1<key;i++)
		{
			int count=0;
			
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				count1++;
				
			}
			
			if(count1==key)
			{
				System.out.println(i);
			}
		}
		
	}
}
