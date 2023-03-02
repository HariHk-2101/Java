package _02_03_23;

public class TestQuestions {

	public static void main(String[] args) {
		
		max2();
		remove();
		search();
	}
	public static void max2() {
		
	System.out.println("2nd max");
		int a[]= {4,2,5,3,2};
		
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
		
		System.out.println(max1);
		
		
	}
	
	public static void remove() {
		System.out.println("Removing elements");
		
		int a[]= {1,2,3,4,5}; int b[]= new int [a.length-1];
		
		int index=2;
		
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(i!=index)
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
	
	public static void search() {
		System.out.println("Searching elements");
		
		int a[]= {10,20,30,40,50};
		
		int search=30; boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				flag=true;
				System.out.println("Searching element is present "+i+" index");
			}
		}
		if(flag==false)
		{
			System.out.println("Elements are no present");
		}
	}
		public static void bubble() {
			
			System.out.println("Bubble Sort");
			
			int a[]= {1,3,2,4,7};
			
		}
	
}
