/* 

 *  Name: Warren

 *  Class: CS1050 (T/TH) 

 *  Description: Calculates Body Mass Index based on US BMI equation     

 *    

 */

// ADD CODE to import Scanner class
import java.util.Scanner;

public class BodyMassIndexActivity
{

	public static void main(String[] args)
	{

		// Create constants and variables
		// constants
		// This causes an error because BMI_US_FACTOR has not been initialized
		// as a value. Find equation, insert below

		// factor formula in pounds
		// Variables
		// Variables
		// The user's weight
		// The user's height
		// The user's BMI
		double BMI_US_FACTOR = 703;

		// Create a Scanner object for scanning input from keyboard
		Scanner input = new Scanner(System.in);
		// Tell the user what the program will do.
		System.out.println("This program will calculate your "
				+ "body mass index, or BMI.");

		// Get the user's weight.
		System.out.print("Enter your weight, in pounds: ");
		// ADD CODE to input next double for weight
		double weight = input.nextDouble();

		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		// ADD CODE input next double for height
		double height = input.nextDouble();

		double bmi = (weight / (height * height)) * BMI_US_FACTOR;

		// Calculate the user's body mass index.
		// Display the user's BMI.
		// %.2f something like that will limit decimal value
		System.out.printf("Your body mass index (BMI) is %.2f", +bmi);

	}
}