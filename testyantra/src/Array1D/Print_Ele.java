package Array1D;

import java.util.Scanner;

public class Print_Ele {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Size Of An array....");
		
		int size=sc.nextInt();
		
		System.out.println("Enter The Values...");
		
		double[] d=new double[size];
		
		for(int i=0 ;i<d.length;i++)
		{
			d[i]=sc.nextDouble();
		}
		
		System.out.println("Printing Elements...");
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
	}
}
