package manjunath;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueChar {



		public static void main(String[] args) {
			
	         String s="hari";
	         char ch[]=s.toCharArray();
	         
	         Map<Character,Integer> m=new HashMap();
	         
	         int i=0;
	         while(i!=ch.length)
	         {
	        	 if(m.containsKey(ch[i])==false)
	        	 {
	        		 m.put(ch[i],1);
	        	 }
	        	 else
	        	 {
	        		      int n= m.get(ch[i]);
	        		      int f=n+1;
	        		      m.put(ch[i],f);
	        	 }
	        	 i++;
	        	 
	         }
	           Set<Entry<Character, Integer>> v=m.entrySet();
	              for( Map.Entry<Character, Integer> data:v)
	              {
	            	  if(data.getValue()>1)
	            	  {
	            		 System.out.println("Doesn't contains all unique characters");
	            		 System.exit(0);
	            	  }
	              }
	              System.out.println("Contains All Unique Characters");
	
}    
	           
}
