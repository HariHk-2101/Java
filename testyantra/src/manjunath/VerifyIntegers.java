package manjunath;

public class VerifyIntegers {

	public static void main(String[] args) {
	
		 String s="11";
		
		 int l=s.length();
		 int i=0;
		 if(s!="")
		 {
		 while(i!=l)
		 {
			 if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			 {
				  ++i;
			 }
			 else
			 {
				 System.out.println("Its Not A integer string");
				 System.exit(0);
			 }
		 }
		 System.out.println("Its A integer String");
	}
		 else
		 {
			 System.out.println("Its Not A integer string");
		 }
	}
}
