package _23_02_23;

public class P12 {
   //distinct Element
	public static void main(String[] args) {
		
	
	int a[]= {1,1,22,3,4,4};
	
	
	
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
				{
				count++;
				}
			
		}
		if(count ==1)
		{
			System.out.println(a[i]);
		}
		
	}
	
	
	}
}
