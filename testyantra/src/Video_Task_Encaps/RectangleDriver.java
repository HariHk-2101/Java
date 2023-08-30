package Video_Task_Encaps;

public class RectangleDriver {

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle();
		
		r1.setLength(3.5);
		r1.setWidth(1.5);
		
		double len=r1.getLength();
		double wid=r1.getWidth();
		
		if(len>1.0&&wid>1.0) {
		System.out.println("Rectangle length: "+len+"\nRectangle width : "+wid);
		}
		else
		{
			System.out.println("Give Rectangle Length & Width Positive Values");
		}
	}
}
