package Oops_Dikshith_Sir;

class Bottle
{
	
}
class Box{
		

}
public class Example1 {
	public static void displayRef(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) {
		
		Box b1=new Box();
		displayRef(b1);
		Box  b2=new Box();
		displayRef(b2);
		
		Bottle b3=new Bottle();
		
		displayRef(b3);
	}
}

