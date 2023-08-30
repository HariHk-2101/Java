package Vertical_patterns;

public class Verti_Left_Up_Tri {


	public static void main(String[] args) {
		
		int n=7;
	
		int num=1;
		
		for(int i=1;i<=n;i++)
		{
			int a=num;
			for(int j=1;j<=i;j++)
			{
			  System.out.print(a +" ");
			  a+=n-j;
			}
			num++;
			System.out.println();
		}
	}

}
