package manjunath;

public class String_Rotation {

	public static void main(String[] args) {
		
		String s="TEST";
		String s1="ST";
		
		String newString =s.concat(s);
		
		if(newString.contains(s1))
		{
			System.out.println("Rotational String");
		}
		else
		{
			System.out.println("Not Rotational String");
		}
				
	}
}
