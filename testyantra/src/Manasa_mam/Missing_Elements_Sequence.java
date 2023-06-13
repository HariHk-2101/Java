package Manasa_mam;

public class Missing_Elements_Sequence {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,7,9};
		
		int count=a[0];
		for (int i = 0; i < a.length; i++) {
			
			if(count==a[i])
			{
				count++;
			}
			else
			{
				System.out.println(count);
				count=a[i]+1;
			}
		}
	}
}
