package manjunath;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class First_Non_Repeated_Char {

	



		public static void main(String[] args) {
			
			 String s="harii";
	         char ch[]=s.toCharArray();
	         
	         Map<Character,Integer> m=new LinkedHashMap();
	         
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
           	  if(data.getValue()==1)
           	  {
           		System.out.print(data.getKey());
           		System.exit(0);
           	  }
             }
	    
		}
}
