package _28_02_23;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="TestYantra SoftwareSolutions";
		
		System.out.println("To Find  Length : "+s.length());
		
		System.out.println("Converting To UpperCase: "+s.toUpperCase());
		
		System.out.println("Converting To LowerCase: "+s.toLowerCase());
		
		System.out.println("Starts With "+s.startsWith("Test"));
		
		System.out.println("Ends With "+s.endsWith("ons"));
		
		System.out.println("Contains "+s.contains("war"));
		
		System.out.println("ConCat "+s.concat(" Indiqube"));
		
		System.out.println("CharAt Select The Index Postion "+s.charAt(3));
		
		System.out.println("The Index Postion find "+s.indexOf('e'));//First Occurance Will be taken
		
		String s1="java";
		String s2="java";
		String s3="Java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,7));
		
		System.out.println("Replace The character Old  To New...");
		
		System.out.println(s1.replace('a', 'o'));
	}
}
