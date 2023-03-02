package _02_03_23;

public class RemoveElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		int rem=2;
		
		int b[]=new int [a.length-1];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(i!=rem)
			{
				b[j]=a[i];
				j++;
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
