package _02_03_23;

public class Max_2nd {

public static void main(String[] args) {
	
	int a[]= {7,3,1,1};
	
	int max=a[0];
	int max1=a[1];
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max1=max;
			max=a[i];
		}
		else if(a[i]>max1)
		{
			max1=a[i];
		}
	}
	System.out.println("2nd maximun value is: "+max1);
}
	
}
