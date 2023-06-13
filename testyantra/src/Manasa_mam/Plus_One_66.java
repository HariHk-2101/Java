package Manasa_mam;

public class Plus_One_66 {

	public static void main(String[] args) {

		int digits[] = {3,2,99};

		Plus_One_66 p = new Plus_One_66();

		int a[] = p.plusOne(digits);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}

	}

	public int[] plusOne(int[] digits) {

		
			for (int i = digits.length - 1; i >= 0; i--) {

				if (digits[i] < 9) {

					digits[i]++;
					return digits;
				}
				else
				{
					digits[i]=0;
				}

			}
		

			int n[] = new int[digits.length + 1];
			 n[0]=1;
			 return n;
			
			

		

	}
}
