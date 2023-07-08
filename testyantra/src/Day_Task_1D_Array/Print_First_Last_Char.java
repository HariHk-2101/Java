package Day_Task_1D_Array;

public class Print_First_Last_Char {
//5.  Create a char array and print first and last char of that array
	public static void main(String[] args) {

		char ch[] = { 'H', 'A', 'R', 'I' };

		for (int i = 0; i < ch.length; i++) {
			if (i == 0 || i == ch.length - 1) {
				System.out.print(ch[i] + " ");
			}
		}
	}
}
