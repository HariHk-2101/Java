package String_own_Logics;

public class String_Length_With_Out_Length_Method {

	public static void main(String[] args) {
		
		String s="hari1";
		
		char ch[]=s.toCharArray();
		
		int count=0;
		for(int j:ch)
		{
			count++;
		}
		System.out.println(count);
	}
}
