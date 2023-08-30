package Vertical_patterns;

public class Vertical_Char {

	public static void main(String[] args) {
		
		char ch='A';
		
		int n=3;
		
		for(int i=1;i<=n;i++)
		{
			char ch1=ch;
			int a=ch;
			for(int j=1;j<=n;j++)
			{
				System.out.print(ch1+" ");
				
				a=a+n;
				
				ch1=(char)a;
			}
			ch++;
			System.out.println();
		}
		
	}
}
