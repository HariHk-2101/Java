package manjunath;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Manjunath Sir Logic");
		String s1="race car";
		s1=s1.replace(" ", "");
		s1=s1.toLowerCase();
	     char[] a=s1.toCharArray();
	     char[] b=new char[s1.length()];
	     
	     int i=0;
	     
	     while(i!=s1.length()) { 
	    	 b[a.length-1-i]=a[i];
	    	 i++;
	     }
	     
	     i=0;
	     while(i!=a.length) {
	    	 if(a[i]!=b[i]) {
	    		 System.out.println("Given String "+s1+" is Palindrome");
	    		 System.exit(0);
	    	 }else {
	    		 i++;
	    	 }
	     }
	     System.out.println("Given String "+s1+" is Palindrome");
	     
	     
	     System.out.println();
	     System.out.println("My Logic1");
	     
	     String s="malayalam";
	     
	     s = s.replace(" ","");
	    
	     
	     char[] ch=s.toCharArray();
	     
	     int temp=0;
	     int temp1=ch.length-1;
	     boolean flag=true;
	     while(temp<temp1 )
	     {
	    	 if(ch[temp]!=ch[temp1])
	    	 {
	    		 flag=false;
	    		 break;
	    	 }
	    	 temp++;
	    	 temp1--;
	     }
	     if(flag==true)
	     {
	    	 System.out.println("Given String "+s+" is Palindrome");
	     }
	     else 
	     {
	    	 System.out.println("Given String "+s+" is Not Palindrome");
	     }
	     
	     System.out.println();
	     
          System.out.println("My Logic2");
	     
	     String s2="mom";
	     
	     s = s2.replace(" ","");
	    
	     String rev="";
	     char[] ch1=s2.toCharArray();
	     
	     for(int j=ch1.length-1;j>=0;j--)
	     {
	    	 rev=rev+ch1[j];
	     }
	     if(rev.equals(s2))
	     {
	    	 System.out.println("Given String "+s2+" is Palindrome");
	     }
	     else
	     {
	    	 System.out.println("Given String "+s2+" is Not Palindrome");
	     }
	}
	

}
