package LeetCode;

public class Happy_Number_202
 {

	public static void main(String[] args) {

		System.out.println(isHappy(12));
	}
	   public static boolean isHappy(int n) {
	        
	        boolean flag=false;
	        while(true)
	        {
	            int sum=0;
	            while(n>0)
	            {
	                int d=n%10;
	                sum=sum+d*d;
	                n=n/10;
	            }
	            n=sum;
	            if(n==1)
	            {
	              flag=true;
	              break;  
	            }
	            else if(n==4)
	            {
	             flag=false;
	               break;
	            }
	        }
	        return flag;
	    }
}
