package Array1D;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		
		
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		int check=30;
		
//		Arrays.sort(a);
		
	/*	for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}*/
		
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			
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
