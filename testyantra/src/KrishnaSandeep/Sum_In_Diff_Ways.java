package KrishnaSandeep;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sum_In_Diff_Ways {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	         int[] s= {4,3,2,1};
	         int sum=Arrays.stream(s).sum();
	         System.out.println(sum);
	         
	         
	         int sum1=IntStream.of(s).sum();
	         System.out.println(sum1);
	         
	         
	         int sum2=Arrays.stream(s).reduce((x,y)->x+y).getAsInt();
	         System.out.println(sum2);
	         
	         int sum3=Arrays.stream(s).reduce(Integer::sum).getAsInt();
	         System.out.println(sum3);
		}

	}

