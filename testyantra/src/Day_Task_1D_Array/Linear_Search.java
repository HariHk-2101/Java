package Day_Task_1D_Array;

public class Linear_Search {

	//39.Linear Search Of An Array
	public static void main(String[] args) {

		int a[] = { 1, 4, 3, 5 };

		int target = 3;

		boolean flag = false;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == target) {
				flag = true;
				System.out.println("Target Found in " + i + " index");
				break;
			}

		}
		if (flag == false) {
			System.out.println("Target Not Found");
		}
	}
}
