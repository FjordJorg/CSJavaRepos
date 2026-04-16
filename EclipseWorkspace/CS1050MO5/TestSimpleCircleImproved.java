
/**
 * 
 */
public class TestSimpleCircleImproved
// Add Comments to explain concepts from M05 on classes and objects
{

	/** Main method */
	public static void main(String[] args)
	{
		System.out.println("Class of " + SimpleCircleA.getShape());
		int totalCircles = SimpleCircleA.getNumberOfObjects();
		System.out.println("Total number of circles: " + totalCircles);

		SimpleCircleA circle1 = new SimpleCircleA();
		System.out.println("Total number of circles: " + totalCircles);
		System.out.println("Circle 1 radius: " + circle1.getRadius() + " area: "
				+ circle1.getArea());

		SimpleCircleA circle2 = new SimpleCircleA(25);
		System.out.println("Total number of circles: " + totalCircles);
		System.out.println("Circle 1 radius: " + circle2.getRadius() + " area: "
				+ circle2.getArea());
		System.out.println("Total number of circles: " + totalCircles);

		// Add code to create a third circle
		// Call the method to print the number of circles
		// set the radius to a new value
		// print the area of the thrid circle

	}
}

class SimpleCircleA
{
	private double radius;

	private static int numberOfObjects = 0;
	private static String shape = "circle";

	/** Construct a circle with radius 1 */
	public SimpleCircleA()
	{
		radius = 1;
		numberOfObjects++;
	}

	// fix the code below.
	public SimpleCircleA(double radius)
	{
		radius = this.radius;
		numberOfObjects++;
	}

	public double getRadius()
	{
		return radius;
	}

	// fix the code below.
	public void setRadius(double radius)
	{
		radius = this.radius;
	}

	public double getArea()
	{
		return radius * radius * Math.PI;
	}

	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}

	public static String getShape()
	{
		return shape;
	}

}