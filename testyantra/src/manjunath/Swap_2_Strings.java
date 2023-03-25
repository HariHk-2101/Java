package manjunath;

public class Swap_2_Strings {

	public static void main(String[] args) {
	      String x="Test";
	      String y="yantra";
	      
	      System.out.println("Before Swap x= "+x);
	      System.out.println("Before Swap y= "+y);
	      
	      System.out.println();
	      String temp="";
	      temp=x;
	      x=y;
	      y=temp;
	      System.out.println("After Swap x="+x);
	      System.out.println("After Swap y="+y);
		}
}
