package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class PersonDetailsSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Set <String> s=new LinkedHashSet<>();
		
		String name="Hari";
		String name1="Praveen";
		String name2="Rick";
		String name3="Purushotham";
		String name4="Nagaraju";
		
		
		s.add(name);
		s.add(name1);
		s.add(name2);
		s.add(name3);
		s.add(name4);
		
		
		Set<Integer> a=new LinkedHashSet<>();
		int age=20;
		int age1=21;
		int age2=22;
		int age3=23;
		int age4=24;
		
		a.add(age);
		a.add(age1);
		a.add(age2);
		a.add(age3);
		a.add(age4);
		
		
		Iterator itr=a.iterator();
		
		Iterator it=s.iterator();
		
		while(itr.hasNext()&&it.hasNext())
		{
			int n=(int)itr.next();
			
			String s1=(String)it.next();
		
			if(n%2==1)
			{
			System.out.println("Name :"+s1+"\nAge :"+n);
							
			}
						
		}
	}
}

