package String_own_Logics;

public class Swapping_2_Strings{

	public static void main(String[] args) {

		String s = "Abc";
		String s1 = "B";
	    
	    
	
		System.out.println("Before Swap "+s+"&"+s1);
		
		s=s+s1;
		
		s1=s.substring(0,s.length()-s1.length());
		
		s=s.substring(s1.length());
	    
	    System.out.println("After Swap "+s+"&"+s1);

	}

}
