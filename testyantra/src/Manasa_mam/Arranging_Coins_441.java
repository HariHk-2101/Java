package Manasa_mam;

public class Arranging_Coins_441 {

	public static void main(String[] args) {
		
		int n=3;
		
		System.out.println(target(n));
	}
	  public static int target(int n) {
		
		 
		  int i = 1;
		for (; i <=n; i++) {
			

                  n=n-i;
		}
		
		
		
		return i-1;
	}
}
