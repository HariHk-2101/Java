package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class CollectionAssign
{
     public static void main(String[] args)
     {
    	 //linkedListMarks();
    	// addNovels();
    	// addEmp();
    	// copyAnotherArrayList(); 
    	 //ProductHashSet();
    	 SetCity();
    	 
     }
     public static void linkedListMarks() {
		
	
	LinkedList ll=new LinkedList();
	
	ll.add(55);
	ll.add(66);
	ll.add(78);
	ll.add(98);
	ll.add(46);
	ll.add(93);
	ll.add(83);
	ll.add(95);
	ll.add(78);
	ll.add(93);
	
	System.out.println("By Using Iterator()");
	Iterator itr=ll.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("By Using forEachLoop");
	
	for(Object o :ll)
	{
		System.out.println(o);
	}
	
	System.out.println("By Using ForLoop");
	
	for(int i=0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
	
}
     
     public static void addNovels() 
     {
    	 LinkedList ll=new LinkedList();
    	 
    	 ll.add("The Guide");
    	 ll.add("The Great Indian Novel");
    	 ll.add("Henry Fielding");
    	 ll.add("Thomas Hardy");
    	 ll.add("Target 3 Billion");
    	 
    	 LinkedList ll2=new LinkedList();
    	 
    	 System.out.println("Before Copying");
    	 System.out.println(ll2);
    	 ll2.addAll(ll);
    	
    	 System.out.println("After Copying");
    	 for(Object o:ll2)
    	 {
    		 System.out.println(o);
    	 }
    	 
    	 
    	 
    	 
	}
     
     
     public static void addEmp() {
 		
    		
    		ArrayList al=new ArrayList();
    		
    		al.add("Hari");
    		al.add("Rick");
    		al.add("Praveen");
    		al.add("Purushotham");
    		al.add("Nagaraju");
    		
    		System.out.println();
    		System.out.println("By Using Iterator()");
    		
    		Iterator itr=al.iterator();
    		
    		while(itr.hasNext())
    		{
    			System.out.println(itr.next());
    		}
    		System.out.println();
    		System.out.println("By Using forEachLoop");
    		
    		for(Object o :al)
    		{
    			System.out.println(o);
    		}
    		System.out.println();
    		System.out.println("By Using ForLoop");
    		
    		for(int i=0;i<al.size();i++)
    		{
    			System.out.println(al.get(i));
    		}
    		
    	}
    	     
    	     public static void copyAnotherArrayList() 
    	     {
    	    	 ArrayList al=new ArrayList();
    	    		
    	    		al.add('H');
    	    		al.add('A');
    	    		al.add('R');
    	    		al.add('I');
    	    		
    	         ArrayList al2=new ArrayList();
    	         System.out.println("Before Copying");
    	    	 System.out.println(al2);
    	    	 
    	    	 al2.addAll(al);
    	    	
    	    	 System.out.println("After Copying");
    	    	 for(Object o:al2)
    	    	 {
    	    		 System.out.println(o);
    	    	 }
    	    	 
    	    	 
    	    	 
    	    	 
    		}
    	     
    	     public static void ProductHashSet()
    	     {
    	    	  HashSet hs=new HashSet();
    	    	  
    	    	  hs.add(1);
    	    	  hs.add(2);
    	    	  hs.add(3);
    	    	  hs.add(4);
    	    	  hs.add(5);
    	    	  
	    	  
    	    	  int prod=1;
    	    	  
    	    	  for(Object o:hs)
    	    	  {
    	    		  prod*=(int)o;
    	    	  }
    	    	 System.out.println(prod);
  	        }
    	     
    	     public static void SetCity()
    	     {
    	    	 Set s=new HashSet();
    	    	 
    	    	 s.add("kadapa");
    	    	 s.add("kurnool");
    	    	 s.add("Tirupati");
    	    	 s.add("Bangalore");
    	    	 s.add("Vizag");
    	    	 
    	    	for(Object o:s)
    	    	{
    	    		System.out.println(o);
    	    	}
    	    	 
    	    	 
    	     }
}
