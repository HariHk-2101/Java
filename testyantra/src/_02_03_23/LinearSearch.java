package _02_03_23;

public class LinearSearch {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60};
	
	int search=20;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==search)
		{
			System.out.println("Searching element present in "+i);
		}
	}
}
}
