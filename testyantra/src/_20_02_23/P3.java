package _20_02_23;

public class P3 {
	public static void marks()
	{
	    int sub1=85;
	    int sub2=95;
	    int sub3=99;
	    int sub4=87;
	    int sub5=93;
	    
        double per=((sub1+sub2+sub3+sub4+sub5)*100)/500;
	    
	    System.out.println("Student marks In Percentage: "+per);
	    
	   if(per>90)
	   {
		   System.out.println("A grade");
	   }
	   else if(per > 80 && per <=90)
	   {
		   System.out.println("B grade");
	   }
	   else if(per>=60 && per<=80)
	   {
		   System.out.println("C grade");
	   }
	   else
	   {
		   System.out.println("D grade");
	   }
}
	public static void main(String[] args) {
		marks();
	}
}
