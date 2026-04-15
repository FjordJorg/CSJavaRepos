/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: 

 *    

 */

import java.util.Scanner;

public class TeamTrainerAppIterationOne
{
	static Scanner input = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// initialize and declare all constants, variables, and strings in main
		double sumMHR = 0.0;
		double averageMHR = 0.0;
		double highestMHR = 0.0;
		int numAthletes = 0;

		// organizing methods
		numAthletes = inputNumAthletes(numAthletes);

		String[] athleteName = new String[numAthletes];
		double[] athleteBMI = new double[numAthletes];
		String[] athleteBMICategory = new String[numAthletes];
		double[] maxHeartRate = new double[numAthletes];
		double[] trainingMHR = new double[numAthletes];

		inputAthleteData(numAthletes, athleteName, athleteBMI, maxHeartRate);

		// For loop to print out athletes to make sure arrays are stored
		// properly and names are printed. Delete once code works.
		for (int index = 0; index < numAthletes; index++)
		{
			System.out.printf(
					"\nAthlete " + (index + 1) + " is: " + athleteName[index]);
			System.out.printf("\nBMI: %.1f", athleteBMI[index]);
			System.out.printf("\nMHR: " + maxHeartRate[index]);
		}
	}
	public static int inputNumAthletes(int numAthletes)
	{

		do
		{
			System.out.println("Enter the number of athletes: ");

			while (!input.hasNextInt())
			{
				System.out.print(
						"Error, please enter a valid number for height in inches: ");
				input.next();
			}

			numAthletes = input.nextInt();
			if (numAthletes <= 0)
			{
				System.out.println(
						" Error, please enter a valid number for height in inches: ");
			}
		} while (numAthletes <= 0);

		return numAthletes;
	}
	public static void inputAthleteData(int numAthletes, String[] athleteName,
			double[] athleteBMI, double[] maxHeartRate)

	{

		input.nextLine(); // clears line for input, otherwise will cause
		// error
		int weight = 0;
		int height = 0;
		double BMI_US_FACTOR = 703;
		int age = 0;

		for (int index = 0; index < numAthletes; index++)
		{

			System.out.println(
					"\nEnter the name for athlete " + (index + 1) + ": ");
			while (!input.hasNext())
			{
				System.out.print("Error, please enter a valid name for athlete "
						+ (index + 1));
				input.next();
			}
			athleteName[index] = input.nextLine();

			do
			{
				System.out.print("Please enter weight in pounds for "
						+ athleteName[index] + ": ");

				while (!input.hasNextInt())
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

			do
			{
				System.out.print("Please enter height in inches for "
						+ athleteName[index] + ": ");

				while (!input.hasNextInt())
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
			athleteBMI[index] = (weight / (double) (height * height))
					* BMI_US_FACTOR;

			do
			{
				System.out.print(
						"Please enter age for " + athleteName[index] + ": ");

				while (!input.hasNextInt())
				{
					System.out.print("Error, number must be greater than 0: ");
					input.next();
				}

				age = input.nextInt();
				if (age <= 0)
				{
					System.out
							.println(" Error, number must be greater than 0: ");
				}
			} while (age <= 0);
			maxHeartRate[index] = 220 - age;

			input.nextLine();
		}
		return;
	}
}
