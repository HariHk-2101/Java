package Pattern_Programs;

//  print
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25
 	 
import java.util.Scanner;

public class P9 {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Row size..");
		
		int row=sc.nextInt();
		
        System.out.println("Enter The Col size..");
		
		int col=sc.nextInt();
		
		int temp=1;
		
		for(int i=1;i<=row;i++)
		{
		for(int j=1;j<=col;j++)
		{
			System.out.print(temp++ + " ");
		}
		System.out.println();
		}
	}
}
