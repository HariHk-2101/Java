package NumberPrograms;

import java.util.Scanner;

public class Xylem_Phloem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number...");
		int num=sc.nextInt();
		int last=num%10;
		num=num/10;
		
		int sumRest=0;
		
		while(num>9) {
			sumRest+=num%10;
			num=num/10;
		} 
		
	   int sumFL=last+num;
		
		if(sumFL==sumRest)
		{
			System.out.println("Given Number is Xylem Number");
		}
		else
		{
			System.out.println("Given Number is Phloem Number");
		}
		
		
 
	}

}

