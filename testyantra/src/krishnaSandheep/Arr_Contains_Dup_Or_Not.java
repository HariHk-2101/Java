package krishnaSandheep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arr_Contains_Dup_Or_Not {

	public static void main(String[] args) {
		
		String [] dup=new String[] {"java","oracle","c","java"};
		
		List dupList=Arrays.asList(dup);
		
		Set dupSet=new HashSet<>(dupList);
		
		if(dupList.size()!=dupSet.size())
		{
			System.out.println("The Arr Contains Duplicates...");
		}
		else
		{
			System.out.println("The Arr Doesn't contains Duplicates...");
		}
	} 
	
}
