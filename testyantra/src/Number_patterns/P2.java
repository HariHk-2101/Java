package Number_patterns;

public class P2 {

	public static void main(String[] args) {
     int n=3;
     int count=1;   
     for(int i=1;i<=n;i++)
     {
    	for(int j=1;j<=n;j++)
    	{
    		System.out.print(count+" ");
    		count++;
    	}
    	System.out.println();
     }
	}
}
