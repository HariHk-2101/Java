package _02_03_23;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		
		
		int low=0;
		int high=a.length-1;
		
		int mid=0;
		int check=50;
	
		
		boolean flag=false;
		while(low<=high)
		{
			mid=(low+high)/2;
			
			if(check==a[mid])
			{
				flag=true;
				System.out.println("key is present in "+mid);
				break;
			}
			else if(check>a[mid])
			{
				low=mid+1;
				high=high;
			}
			else
			{
				high=mid-1;
				low=low;
			}
		
			
		}
		
		if(flag==false)
		{
			System.out.println("There is no Element..");
		}
		
		
		
//		int mid1=(low+high)/2;
//		for(int i=0;i<a.length;i++)
//		{
//			if(mid1>=check)
//			{
//				System.out.println("element found in "+i);
//			}
//			else if(mid<=check)
//			{
//				System.out.println("element found in "+i);
//			}
//			else
//			{
//				System.out.println("There Is no element..");
//			}
//		}
	}
}
