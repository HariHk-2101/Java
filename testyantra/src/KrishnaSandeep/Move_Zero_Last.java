package KrishnaSandeep;

public class Move_Zero_Last {

	public static void main(String[] args) {
		
       int a[]= {0,1,2,0,3,0,4,5,0};
       int b[]=new int[a.length];
       zero(a,b);
	}

	private static void zero(int[] a, int[] b) {
		int j=0;
		int n=b.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[j]=a[i];
				j++;
			}
			else {
				b[n]=a[i];
				 n--;
			}
		}
		for(int y:b)
		{
			System.out.print(y+" ");
		}
		
	}
}
