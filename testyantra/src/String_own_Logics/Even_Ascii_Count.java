package String_own_Logics;

public class Even_Ascii_Count {

     public static void main(String[] args) {
		
    	 String s="java";
    	 
    	 int count=0;
    	 for (int i = 0; i < s.length(); i++) {
			
    		 int asc=s.charAt(i);
    		 
    		 if(asc%2==0)
    		 {
    			 count++;
    			 System.out.println(s.charAt(i)+" = "+ asc);
    		 }
		}
    	System.out.println("Given String "+s+" contains "+count+" Even Ascii Values");
    	 
	}
}
