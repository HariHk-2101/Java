package KrishnaSandeep;

public class First_dup_Occur {

	public static void main(String[] args) {
    
		
		int a[]= {1,2,1,4,5,6,7};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("1st Occured Ele Given Array "+a[i]);
					return;
				}
			}
		}
	}
}


