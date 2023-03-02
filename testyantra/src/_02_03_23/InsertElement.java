package _02_03_23;

public class InsertElement {

	public static void main(String[] args) {
		
	
	int a[]= {1,2,3,4,6};
	
	int element=5;
	int index=4;
	
	int b[]=new int[a.length+1];
	
	int j=0;
	if(index>=a.length)
	{
		System.out.println("Array Index Invalid...");
	}
	else
	{
	for(int i=0;i<a.length;i++)
	{
		if(index==j)
		{
			b[j]=element;
			j++;
		}
		
		  b[j]=a[i];
		  j++;
		
	 }
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
		
	}
	
}
}