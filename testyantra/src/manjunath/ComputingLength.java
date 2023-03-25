package manjunath;

public class ComputingLength {
public static void main(String[] args) {
	

	System.out.println("Manjunath Sir Logic...");
	String s="Tyss Yantra";
	
       s=s.concat("\0");
       
       char []c=s.toCharArray();
       
       int i=0;
       int count=0;
       while(c[i]!='\0')
       {
    	   count++;
    	   i++;
       }
       System.out.println(count);
       
       
      System.out.println("My Logic...");
      
      String s1="Tyss Yantra";
      
      char []ch=s1.toCharArray();
      
      int count1=0;
      
      int i1=0;
      while(i1<ch.length)
      {
    	  count1++;
    	  i1++;
      }
      System.out.println(count1);
     
      
       
       
       
       
}
}
