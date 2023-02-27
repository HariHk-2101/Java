package _16_02_23;

import java.util.Scanner;

public class Xylem_Phloem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number...");
		int num=sc.nextInt();
		int temp=num;
		int sumFL=0;
		int sumRest=0;
		
		while(num>0) {
			if(num==temp|| num<=9)
			{
				sumFL+=num%10;
			}
			else
			{
				sumRest+=num%10;
			}
          num/=10;
		}
	
		
		if(sumFL==sumRest)
		{
			System.out.println("Given Number "+temp+" is Xylem Number");
		}
		else
		{
			System.out.println("Given Number "+temp+" is Phleom Number");
		}
		
		

	}

}

