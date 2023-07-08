package Day_Task_1D_Array;

public class Find_Prod_Each_Ele {
//35.  Find the product of each array elements

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };

		int prod = 1;
		for (int i = 0; i < a.length; i++) {
			prod = prod * a[i];
		}
		System.out.println(prod);
	}
}
