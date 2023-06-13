package Day_Task_1D_Array;

public class Find_Ele_Sec_Time {
//29.  Find which element is present for the second time in which index
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,4};
		 
		 boolean flag=false;
		for (int i = 0; i < a.length; i++) {
	
			for (int k = i+1; k < a.length; k++) {

			if(a[i]==a[k])
				{
				flag=true;
					System.out.println(a[i]+" present second time in "+k+" index");
				}
			}
		}
		if(flag==false)
		{
			System.out.println("There is No Sec Ele");
		}
		
	}
}
