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

		System.out.println("This program will calculate your "
				+ "body mass index, or BMI.");

		double weight = validateWeight();
		double height = validateHeight();

		double bmi = calculateBMI(weight, height);

		categorizeBMI(bmi);

		input.close();
	}

	public static double validateWeight()
	{

		double weight = 0;

		do
		{
			System.out.print("Please enter weight in pounds: ");

			while (!input.hasNextDouble())
			{
				System.out.print(
						"Error, please enter a valid number for weight in pounds: ");
				input.next();
			}

			weight = input.nextInt();
			if (weight <= 0)
			{
				System.out.println(
						" Error, please enter a valid number for weight in pounds: ");
			}
		} while (weight <= 0);

		return weight;
	}

	public static double validateHeight()
	{

		double height = 0;

		do
		{
			System.out.print("Please enter height in inches: ");

			while (!input.hasNextDouble())
			{
				System.out.print(
						"Error, please enter a valid number for height in inches: ");
				input.next();
			}

			height = input.nextInt();
			if (height <= 0)
			{
				System.out.println(
						" Error, please enter a valid number for height in inches: ");
			}
		} while (height <= 0);

		return height;
	}

	public static double calculateBMI(double weight, double height)
	{

		final double BMI_US_FACTOR = 703;
		final double bmi = (weight / (height * height)) * BMI_US_FACTOR;

		return bmi;
	}

	public static double categorizeBMI(double bmi)
	{

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

		return bmi;
	}

}
