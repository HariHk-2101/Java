package _20_02_23;

public class MethodRecursion {

	
	public static void test(int count) {
		
		if(count<=1)
		{
			return;
		}
		else {
			
		System.out.println("Welcome to testyantra");
		test(count-1);
		}
		
	}
	public static void main(String[] args) {
		
		test(6);
	}
}
