  package Array1D;

import java.util.Scanner;

public class Palindrome_Ele {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The 1st Array Size...");
		
		int size=sc.nextInt();
		
		System.out.println("Enter The Elements....");
		
		int arr1[]=new int[size];
		
		
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		 //Entire Array logic....
	
//				boolean flag=true;
//		        
//				int temp = 0, temp1= size-1;
//				
//		        while (temp < temp1) {
//		        	
//		            if (arr1[temp] != arr1[temp1]) 
//		            {
//		                flag=false;
//		                break;  
//		            }
//		            temp++;
//		            temp1--;
//		        }
//		        if (flag==true) {
//		            System.out.println("Given array is a palindrome.");
//		        } else {
//		            System.out.println("Given array is not a palindrome.");
//		        }
		        
		        
		   // single element 
		        
		        boolean flag1=false;
		        
		        for(int j=0 ;j<size;j++)
		        {
		        	int n=arr1[j];
		        	int n1 =n;
		        	int rev=0;
		        	
		        	while(n>0)
		        	{
		        		int d=n%10;  
		        		rev=rev*10+d;
		        		n/=10;
		        	}
		        	
 		        	  if(n1==rev)
				        {
		        		  flag1=true;
				         System.out.println("Palindrome elements are "+n1);
				        }  
		      
		       }
		        
		     if(flag1==false)
		     {
		    	 System.out.println("No palindrome elements in array");
		     }
		        
		     
		}
		
   }
