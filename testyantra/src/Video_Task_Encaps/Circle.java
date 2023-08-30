package Video_Task_Encaps;

public class Circle {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius)
	{
		
		this.radius = radius;
	}
	
	public double calculateArea(double radius)
	{
		
		return 3.14*radius*radius;
	}
	public double calculatePerimeter(double radius)
	{
		return 2*3.14*radius;
	}

	
}
