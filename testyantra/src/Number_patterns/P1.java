package Number_patterns;

public class P1 {

	public static void main(String[] args) {
     int n=3;
     for(int i=1;i<=n;i++)
     {
    	 int b=i;
    	 for(int j=1;j<=n;j++)
    	 {
    		System.out.print(b+" ");
    		b=b+3;
    	 }
    	 System.out.println();
     }
	}

}
