package Array1D;

import java.util.Scanner;

public class Palindrome_Array {

	//palindrome
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The 1st Array Size...");
		
		int size1=sc.nextInt();
		
		System.out.println("Enter The Elements....");
		
		char ch []=new char[size1];
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		
		
		int j=ch.length-1;
		
		boolean flag=false;
		
		for(int i=0 ; i<j ; i++)
		{
			if(ch[i]==ch[j])
			{
				flag=true;
				
			}
		
			j--;
		}
		
		if(flag==false)
		{
			System.out.println("The given Array is Not palindrome..");
		}
		else
		{
			System.out.println("The Given Array is palindrome");
		}
		
}
}
