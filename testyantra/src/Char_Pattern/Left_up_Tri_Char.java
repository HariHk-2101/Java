package Char_Pattern;

public class Left_up_Tri_Char {

	public static void main(String[] args) {
		int n=5;
		char ch = 'A';
		int asc='A';  
		for (int i = 1; i <= n; i++) {
			int a=asc;
			char ch1=ch;
			for (int j = 1; j <= i; j++) {
				
				
				System.out.print(ch1+" ");
				a=a+n-j; 
				ch1=(char) a;
				
			}
			ch++;
			asc++;
			System.out.println();
		}
	}
}
