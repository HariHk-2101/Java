package Day_Tasks_Num;

public class Xylem_Phloem {

	public static void main(String[] args) {
		
		int num=1234;
		int last=num%10;
		    num/=10;
		 int sum=0;
		 
		 while(num>9)
		 {
			 int d=num%10;
			 sum=sum+d;
			 num/=10;
		 }
		 
		 int sum1=last+num;
		 if(sum==sum1)
		 {
			 System.out.println("Xylem");
		 }
		 else
		 {
			 System.out.println("Phloem");
		 }
		  
	}
}
