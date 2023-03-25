package manjunath;

public class Count_V_C_S {

	public static void main(String[] args) {
		String s="aeiou";
	       int l=s.length();
	       char[] ch1=s.toLowerCase().toCharArray();
	        int vowelscount=0;
	        int conscount=0;
	        int spcount=0;
	       int i=0;
	       while(i!=l)
	       {
	    	   if(ch1[i]>='a'&&ch1[i]<='z')
	    	   {
	    		   if(ch1[i]=='a'||ch1[i]=='e'||ch1[i]=='i'||ch1[i]=='o'||ch1[i]=='u')
	    		   {
	    			   vowelscount++;
	    		   }
	    		   else
	    		   {
	    			   conscount++;
	    		   }
	    	   }
	    	   else
	    	   { 
	    		   spcount++;
	    	   }
	    	   i++;
	       }
	       System.out.println("vowels "+vowelscount);
	       System.out.println("consonents "+conscount);
	       System.out.println("special charecters "+spcount);
	
	}
}
