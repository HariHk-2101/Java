package _02_03_23;

public class ZigZag {

	public static void main(String[] args) {
		int a[]= {1,54,3,5,34};
		int b[]= {1,54,3,5,34};
		int c[]= new int[a.length+b.length];
		
		int temp=0,temp1=0;
		for(int i=0;i<c.length;i++)
		{
			if(temp<a.length)
			{
				c[i]=a[temp++];
				i++;
			}
			if(temp1<b.length)
			{
				c[i]=b[temp1++];
			}
		}
		
		for(int i=0;i<c.length;i++)
		{
		System.out.println(c[i]);
		}
	}
}
