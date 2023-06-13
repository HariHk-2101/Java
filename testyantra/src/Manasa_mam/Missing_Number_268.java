package Manasa_mam;

public class Missing_Number_268 {

	public static void main(String[] args) {
		
		int num[]= {0,1};
		
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
		}
		
		int formula=num.length*(num.length+1)/2;
		
		int miss=formula-sum;
		
		System.out.println(miss);
	}
}
