package NumberPrograms;

import java.util.Scanner;

public class Multi_Table {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Number1...");
		int num1=sc.nextInt();
		System.out.println("Enter The Number 2...");
		int num2=sc.nextInt();
		
		int count=num1;
		
		for(int i=num1 ;i<=num2 ; i++)
		{
			
			
			System.out.println(count++ +" Multiplication Table...");
			for(int j=1;j<=10;j++)
			{
			
				int multi=i*j;
				
				System.out.println(i+"*"+j+"="+multi);
			}
			
			System.out.println();
			
		}
		
		
//		for(int i=1;i<=10;i++)
//		{
//			int multi=num1*i;
//			System.out.println(num1+"*"+i+"="+multi);
//		}
}

}
