package manjunath;

public class Remove_WhiteSpace {

	public static void main(String[] args) {
		
		String s="test yantra software solution";
		s=s.replace(" ","");
		System.out.println(s);
		s=s.replace("\\t","");
		System.out.println(s);
		s=s.replace("\\s","");
		System.out.println(s);
	
		
	}
}
