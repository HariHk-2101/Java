package Practice_Patterns;

public class Pra2 {

	public static void main(String[] args) {

		int n = 3;
		int star=1;
		int sp=n-1;
		int num=1;
		 for(int i=1;i<=n*2-1;i++)
		 {
			 for(int j=1;j<=sp;j++)
			 {
				 System.out.print("  ");
			 }
			 for(int k=1;k<=star;k++)
			 {
				
				 System.out.print(num +" ");
				 
				
				 
			 }
			 if(i<n)
			 {
			 star+=2;
			 sp--;
			 }
			 else
			 {
			    star-=2;
			    sp++;
			 }
			 
			 
			System.out.println();
		 }
		

	}
}
