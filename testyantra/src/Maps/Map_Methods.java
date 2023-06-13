package Maps;

import java.util.HashMap;
import java.util.Map;

public class Map_Methods {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<>();
		
		//Using Put(Key , Value); We Will Insert Values And Keys In Map..
		map.put("A", "Apple");
		map.put("B", "Ball");
		map.put("C", "cat");
		
		
		for(Map.Entry<String, String> entry :map.entrySet())
		{
			System.out.print(entry.getKey()+"=");
			System.out.print(entry.getValue()+",");
		}
		  System.out.println();
		  
		//Using ContainsKey(Object Key)..
		  
	   System.out.println(map.containsKey("A"));  
		
		//Using ContainsValue(Object Value)...
	   
	   System.out.println(map.containsValue("App"));
	   
	   //Using Size(No Argument);
	   
	   System.out.println(map.size());
	   
	   System.out.println();
	   System.out.println("--------------");
	   //Using remove(Key)..
	   
	   System.out.println(map.remove("D"));
	   
	     
	   for(Map.Entry<String, String> entry1 : map.entrySet())
	   {
		   System.out.println(entry1.getKey());
	   }
	   System.out.println("--------------");
	   
	   //using remove(key,value)..
	   
	   System.out.println(map.remove("C","Ball"));
	   
	   System.out.println("------------");
	   //Using Replace(key,value)...
	   
	   System.out.println(map.replace("A", "App"));
	   
	   System.out.println(map.get("A"));
	   
	   System.out.println("--------------");
	   
	   //Using replace(key,oldvalue,newvalue)
	   
	   System.out.println(map.replace("A",   "App","Apple"));
	   
	   System.out.println(map.get("A"));
	   
	   System.out.println("---------------");
	   
	   
	   
	}
}
