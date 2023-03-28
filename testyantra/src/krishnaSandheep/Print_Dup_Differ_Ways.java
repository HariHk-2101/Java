package krishnaSandheep;

import java.util.HashSet;

import java.util.Set;

public class Print_Dup_Differ_Ways {

	public static void main(String[] args) {
		
      int []a= {1,2,3,1,2,5};
      
      duplicate( a);
      nextmethod(a);
     
	}

	 private static void nextmethod(int[] a)
	 {
		 
		 System.out.println("By Using HashSet..");
		Set<Integer> s=new HashSet();
		
		for(int i=0;i<a.length;i++)
		{
			if(s.contains(a[i]))
			{
				System.out.print(a[i]+" ");
			}
			else
			{
				s.add(a[i]);
			}
		}

	}

	
	static void duplicate(int[] a) {
		
		System.out.println("Normal Way");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		
		System.out.println();
	}

}
