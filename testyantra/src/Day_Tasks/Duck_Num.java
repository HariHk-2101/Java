package Day_Tasks;

public class Duck_Num {

	public static void main(String[] args) {
		
		String s="1240";
		
		if(duckNum(s)==true)
		{
			System.out.println("Duck Num...");
		}
		else
		{
			System.out.println("Not Duck...");
		}
		
	
	}
	public static boolean duckNum(String s) {
		
		 if(s.charAt(0)=='0') {
			 return false;
		 }
		 else
		 {
			 for(int i=1;i<s.length();i++)
			 {
				 if(s.charAt(i)=='0')
				 {
					 return true;
				 }
					 
			 }
		 }
		 return false;
	}
}
