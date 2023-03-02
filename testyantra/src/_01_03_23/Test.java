package _01_03_23;

public class Test {

	public static void main(String[] args) {
		max2();
		min2();
		distinct();
		common();
		highsum();
	}
	
	public static void max2() {
		System.out.println();
		int a[]= {9,2,3,4,5};
		
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
		System.out.println("2nd max value is "+max1);
	}
	
	
	public static void min2() {
		System.out.println();
		int a[]= {1,3,4,2,5};
		
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
		System.out.println("2nd min value is "+min1);
	}
	
	public static void distinct() 
	{
		System.out.println();
		int a[]= {1,2,4,4,2};
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			
			for(int j=0;j<a.length;j++)
			{
			if(a[i]==a[j])
			{
			 count++;
			}
		}
		
		
		if(count==1)
		{
			flag=true;
			System.out.println("distict elements are "+a[i]);
		}
		
	}
		if(flag==false)
		{
			System.out.println("There is no distinct value..");
		}
	}
	
	public static void common() 
	{
		System.out.println();
		int a[]= {1,2,3,4,6};
		int b[]= {2,4,4,2,4};

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
	   }
	}
	public static void highsum() 
	{
		System.out.println();
		int [] a= {1,4,7,3,7};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]>sum)
				{
					sum=a[i]+a[j];
				}
				
			}
		}
		System.out.println(sum);
		
	}
}
