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
		
		//Create constand an variables
		// constants
		double bmi;
		final double BMI_US_FACTOR;
		double weight = 0;
		double height = 0;
		double bmi;
		 // factor formula in pounds
		// Variables
		// Variables
		// The user's weight
		// The user's height
		 // The user's BMI

		// Create a Scanner object for scanning input from keyboard
		Scanner input = new Scanner(System.in);
		// Tell the user what the program will do.
		System.out.println("This program will calculate your " + "body mass index, or BMI.");

		// Get the user's weight.
		System.out.print("Enter your weight, in pounds: ");
		// ADD CODE to input next double for weight
		weight = UserInput.nextDouble();

		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		// ADD CODE input next double for height
		height = UserInput.nextDouble();

		// Calculate the user's body mass index.
		bmi = weight * BMI_US_FACTOR / (height * height);

		// Display the user's BMI.
		System.out.printf("Your body mass index (BMI) is %f", bmi);
		

	}
}