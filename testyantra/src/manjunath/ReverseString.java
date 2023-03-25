package manjunath;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Manjunath Sir Logic");
	     String s1="Test Yantra";
	     char[] a=s1.toCharArray();
	     char[] b=new char[s1.length()];
	     
	     int i=0;
	     
	     while(i!=s1.length()) { 
	    	 b[a.length-1-i]=a[i];
	    	 i++;
	     }
	     System.out.println(b);
	     
	     
	     System.out.println();
	     
	     
	     
	     System.out.println("My Logic");
	     
	     String s2="Test Yantra";
	     
	     String rev="";
	     
	     for(int i1=s2.length()-1;i1>=0;i1--)
	     {
	    	 
	    	 rev=rev+s2.charAt(i1);
	    	
	     }
	     System.out.println(rev);
	  
		}
	
}
