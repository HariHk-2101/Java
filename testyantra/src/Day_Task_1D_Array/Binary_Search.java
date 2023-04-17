package Day_Task_1D_Array;

import java.util.Arrays;

public class Binary_Search {

	//3.  Binary search of an array
	
	public static void main(String[] args) {
		
		int a[]= {20,30,10,50,40};
		
		 Arrays.sort(a);
		 
		 System.out.println("After Sorting "+Arrays.toString(a));
		 
		 int low=0;
		 int high=a.length-1;
		 int key=50;
		 boolean flag=false;
		 int mid=0;
		 while(low<=high)
		 {
			 mid=(low+high)/2;
			 
			 if(key==a[mid])
			 {
				 flag=true;
				 break;
			 }
			 else if(key>a[mid])
			 {
				 low=mid+1;
			 }
			 else if(key<a[mid])
			 {
				 high=mid-1;
			 }
			 
		 }
		if(flag==true)
		{
			System.out.println(key+" present in "+mid+" index");
		}
		else
		{
			System.out.println(key +" Not Present");
		}
	}
}
