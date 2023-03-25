package manjunath;

import java.util.HashMap;
import java.util.Map;

public class Occurance {

     public static void main(String[] args) {
		
		
		String s="harikrishna";
		char c[]=s.toCharArray();
		
		Map<Character,Integer> m=new HashMap();
		int i=0;
		while(i!=c.length)
		{
			if(m.containsKey(c[i])==false)
			{
				m.put(c[i],1);
				
			}else
			{
				int h=m.get(c[i]);
				int g=h+1;
				m.put(c[i],g);
			}
			i++;
		}
		System.out.println(m);	
	
		
		}
}
