package _02_03_23;

public class SecondMIn {
public static void main(String[] args) {
	int a[]= {1,5,3,5,6,7};
	
	int min=a[0];
	int min1=a[1];
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min1=min;
			min=a[i];
		}
		else if(a[i]<min1)
		{
			min1=a[i];
		}
	}
	
	System.out.println("2nd min value "+min1);
}
}
