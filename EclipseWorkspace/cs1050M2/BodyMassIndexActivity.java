/* 

 *  Name: Warren Hirschfeld

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
		// Create a Scanner object for scanning input from keyboard
		Scanner input = new Scanner(System.in);
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
		// Tell the user what the program will do.
		System.out.println("This program will calculate your "
				+ "body mass index, or BMI.");

		// Get the user's weight.
		System.out.print("Enter your weight, in pounds: ");
		// assigns user input to next double variable for weight
		double weight = input.nextDouble();

		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		// assigns user input for next double variable for height
		double height = input.nextDouble();

		// US BMI calculation
		double bmi = (weight / (height * height)) * BMI_US_FACTOR;

		// if else if statement to test and output correct category for
		// potential bmi numbers.
		if (bmi < 18.5)
		// Display the user's BMI based on given input and calculated bmi
		// %.2f will limit decimal value, .%n instructs program to start a new
		// line
		//
		{
			System.out.printf("Your BMI is %.2f. This is underweight.%n", bmi);
		} else if (bmi < 25.0)
		{
			System.out.printf("Your BMI is %.2f. This is a healthy weight.%n",
					bmi);
		} else if (bmi < 30.0)
		{
			System.out.printf("Your BMI is %.2f. This is overweight.%n", bmi);
		} else
		{
			System.out.printf("Your BMI is %.2f. This is obese.%n", bmi);
		}
		input.close();
	}
}