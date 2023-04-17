package Day_Task_1D_Array;

public class Distinct_Ele {

	//11.  Find distinct element in an array
	
	public static void main(String[] args) {
		
		int a[]= {10,10,20,20,20,30};
		boolean flag=false;
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
			
			if(count==1)
			{
				flag=true;
				System.out.println(a[i]);
			}
			
			
		}
		if(flag==false)
		{
			System.out.println("Distinct Elements Are Not There");
		}
		
	}
}
