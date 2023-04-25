package Day_Task_1D_Array;

import java.util.Scanner;

public class Find_Multiple_Ele_Array {

	//28.  Find multiples of a element present in array
	public static void main(String[] args) {
	
	int a[]= {10,15,44,32};
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter The Num...");
	
	int num=sc.nextInt();
	
	boolean flag=false;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%num==0)
		{
			flag=true;
			System.out.println(a[i]+" is Multiply by "+num);
		}
	}
	if(flag==false)
	{
		System.out.println("No Numbers are Multiply by "+num);
	}
	
			
	}
}
