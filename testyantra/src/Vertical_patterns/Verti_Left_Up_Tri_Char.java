package Vertical_patterns;

public class Verti_Left_Up_Tri_Char {

public static void main(String[] args) {
		
		char ch='A';
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			char ch1=ch;
			int a=ch;
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch1+" ");
				
				a=a+n-j;
				
				ch1=(char)a;
			}
			ch++;
			System.out.println();
		}
		
	}
}
