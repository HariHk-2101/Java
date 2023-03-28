package krishnaSandheep;

import java.util.Arrays;

public class SecMax_InBuilt {


	public static void main(String[] args) {
		
         int[] a= {2,5,3,8,6,10};
         Arrays.sort(a);
         System.out.println("second max num "+a[a.length-2]);
	}

}
