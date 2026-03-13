/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: Validates user input, then calculates Body Mass Index 
 *  based on US BMI equation, categorizes BMI based on input, asks user
 *  if they want to repeat process with a new entry.   

 *    

 */

import java.util.Scanner;

public class GEMO3DisplayBMISummary
{

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{

		double BMI_US_FACTOR = 703;

		System.out.println("This program will calculate your "
				+ "body mass index, or BMI.");

		double[] measurements = validateBMInumbers();

		double weight = measurements[0];
		double height = measurements[1];

		double bmi = (weight / (height * height)) * BMI_US_FACTOR;

		if (bmi < 18.5)
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

	public static double[] validateBMInumbers()
	{

		double weight = 0;
		double height = 0;

		do
		{
			System.out.print("Please enter weight in pounds: ");
			weight = input.nextInt();
			if (weight <= 0)
			{
				System.out.println(" Error, not a valid number. ");
				System.out.println(" Try again please ");
			}
		} while (weight <= 0);

		do
		{
			System.out.print("Please enter height in inches: ");
			height = input.nextInt();
			if (height <= 0)
			{
				System.out.println(" Error, not a valid number. ");
				System.out.println(" Try again please ");
			}
		} while (height <= 0);

		return new double[]
		{weight, height};

	}
}
