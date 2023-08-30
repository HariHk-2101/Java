package Task;

public class MethodPass1 {

	public static int rec(int a)
	{
		
		
		if(a==0)
		{
			return a;
		}
		else
		{
			System.out.println(a);
			a--;
		}
		if(a>5) {
		return rec(a);
		}
		return 1;
		
	}

	public static void main(String[] args) {

		rec(1);
	}
}
