package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Ice_Cream {



	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
	    al.add("Chocolate");
	    al.add("Kulfi");
	    al.add("AmulIceCream");
	    al.add("Vennela");
	    al.add("Strawberry");
	    
	    
	    Iterator it=al.iterator();
	    
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
		
		
	}
}
