package Vertical_patterns;

public class Vertical_Num {

	public static void main(String[] args) {
		
		int n=4;
	
		int num=1;
		
		for(int i=1;i<=n;i++)
		{
			int a=num;
			for(int j=1;j<=n;j++)
			{
			  System.out.print(a +" ");
			  a+=n;
			}
			num++;
			System.out.println();
		}
	}
}
