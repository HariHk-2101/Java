package krishnaSandheep;

import java.util.Scanner;

public class Sum_Of_Array_Ele {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the array size");
     int n=sc.nextInt();
     int[] a=new int[n];
     System.out.println("enter the values");
     for(int i=0;i<a.length;i++) {
    	a[i]=sc.nextInt();
     }
     int sum=0;
     for(int i=0;i<a.length;i++) {
    	 sum=sum+a[i];
     }
     System.out.println("Sum Of Total Array Elements  "+sum);
}
}
