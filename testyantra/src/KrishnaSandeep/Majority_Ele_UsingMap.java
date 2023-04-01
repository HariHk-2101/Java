package KrishnaSandeep;

import java.util.HashMap;
import java.util.Map;
//Which ele is Occured more times?
public class Majority_Ele_UsingMap {
	
	public static void main(String[] args) 
	{
		//Dont Change Input
		int[] a= {10,20,10,10,30};
		
     Map<Integer,Integer> m=new HashMap<>();
     
     for(int i=0;i<a.length;i++) {
    	 
    	 m.put(a[i], m.getOrDefault(a[i], 0)+1);
     }
     
     //Iterate through the map
     for(Map.Entry<Integer,Integer> i : m.entrySet()) {
    	 if(i.getValue()>a.length/2) {
    		 int res=i.getKey();
    		 System.out.println(res);
    	 }
     }
     
	}

}

