package Video_Task_Encaps;

public class CircleDriver {

	public static void main(String[] args) {

		Circle c1 = new Circle();

		c1.setRadius(1.0);

		double rad = c1.getRadius();

		if (rad >= 1.0) {
			System.out.println("Radius " + rad);
			System.out.println("Circle Area " + c1.calculateArea(rad));
			System.out.println("Circle Perimeter " + c1.calculatePerimeter(rad));
		} else {
			System.out.println("Give Positive Value for Radius...");
		}

	}
}
