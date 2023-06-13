package Practice_Patterns;

public class Tri_Logic {

	public static void main(String[] args) {

		int n = 5;
//		int rows=2*n-1;
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				if((j<=i && i<=n)||(i>n && i+j<=2*n ))
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}

//		char ch='A';
//		int a=1;
//		for (int i = 1; i <= n; i++) {
//			
//			
//			for (int j = 1; j < n + i; j++) {
//				
//				if (j > n - i) {
//					if(i%2==1)
//					{
//					System.out.print(ch +" ");
//					}
//					else
//					{
//						System.out.print(a +" ");
//					}
//					
//				} else {
//					System.out.print("  ");
//				}
//				
//			}
//			ch++;
//			a++;
//			
//			System.out.println();
//		}

		for (int i = n; i >= 1; i--) {

			for (int j = 1; j < n + i; j++) {

				if (j > n - i) {
					System.out.print("* ");

				} else {
					System.out.print("  ");
				}

			}

			System.out.println();
		}
	}
}
