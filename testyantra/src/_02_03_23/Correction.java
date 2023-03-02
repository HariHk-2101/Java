package _02_03_23;

public class Correction {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	
	int index=2;
	
	int b[]=new int [a.length-1];

	for(int j=0;j<b.length;j++)
	{
		for(int i=0;i<a.length;i++)
		{
			if(i!=index)
			{
				b[j]=a[i];
				j++;
			}
		}
	}
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
	

}
}
