package Array1D;

public class Distict_Ele {
   //distinct Element
	public static void main(String[] args) {
		
	
	int a[]= {1,2,8,0,7,7,8,8,8,8,8};
	
	boolean flag=false;
	
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		
		for(int j=i;j<a.length;j++)
		{
			
			if(a[i]==a[j])
				{
				count++;
				}
			
		}
		if(count==1)
		{
			flag=true;
			System.out.println(a[i]);
		}
		
	}
	if(flag==false)
	{
		System.out.println("not");
	}
	
	
	}
}
