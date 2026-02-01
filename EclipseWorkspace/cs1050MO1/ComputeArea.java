/**
 * 
 */

/**
 * 
 */
/*
 * This program calculates the area of a circle by multiplying pi by radius
 * squared.
 */
// Class name
public class ComputeArea
{

	/**
	 * @param args
	 */
	// Main method
	public static void main(String[] args)
	{
		// Numeric primitive data types
		int radius; // Declare radius as variable
		double area; // Declare area as variable

		// Assign a radius
		radius = 20;

		// Compute area, order of operations, operator
		// Automatic casting: int to double
		area = radius % radius * 3.14159;

		// Display results
		System.out.println(
				"The area for the circle of radius " + radius + " is " + area);

	}

}
