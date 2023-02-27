package _20_02_23;

public class P2 {
  
	public static void marks()
	{
	    int sub1=85;
	    int sub2=95;
	    int sub3=99;
	    int sub4=87;
	    int sub5=93;
	    
	    double avg=(sub1+sub2+sub3+sub4+sub5)/5;
	    
	    System.out.println("Student Marks in average: "+avg);
	    
	    double per=((sub1+sub2+sub3+sub4+sub5)*100)/500;
	    
	    System.out.println("Student marks In Percentage: "+per);
	    
	}
	
	public static void main(String[] args) {
		marks();
	}
}
