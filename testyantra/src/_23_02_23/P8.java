package _23_02_23;

import java.util.Scanner;

public class P8 {

	//2ndMin Value
	
	 public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter The Array Size..");
			
			int size=sc.nextInt();
			
		    System.out.println("Enter The Elements...");
		    
		    int [] arr=new int [size];
		    
		    for(int i=0;i<arr.length;i++)
		    {
		    	arr[i]=sc.nextInt();
		    	
		    }
		    
		    int check=arr[0];
		   
		    
		    int count=0;
		    
		    for(int i=0;i<arr.length;i++)
		       {
		    	  for(int j=i+1;j<arr.length;j++)
		    	  {
		    		  if(arr[i]!=1 && arr[i]==arr[j])
		    		  {
		    			  arr[j]=-1;
		    			  count++;
		    		  }
		    	  }
		       }
		    
		    int temp=0;
		
		    int b[]=new int[arr.length-count];
		    
		    
		    for(int i=0;i<arr.length;i++)
		    {
		    	if(arr[i]!=-1)
		    	{
		    		b[temp++]=arr[i];
		    	}
		    }
		   
		    
		    if(b.length>=2)
		    {
		    	for(int i=0;i<b.length;i++)
		    	{
		    		for(int j=i+1;j<b.length;j++)
		    		{
		    			if(b[i]<b[j])
		    			{
//		    				b[i]=b[j]-b[i]+(b[j]=b[i]);
		    				
		    				b[i]=b[i]+b[j];
		    				b[j]=b[i]-b[j];
		    				b[i]=b[i]-b[j];
		    			}
		    		}
		    	}
		    	
		    	System.out.println("Second min element is: "+b[b.length-2]);
		    }
		    else
		    {
		    	System.out.println("there is no second min element..");
		    }
	  
	 }
}

