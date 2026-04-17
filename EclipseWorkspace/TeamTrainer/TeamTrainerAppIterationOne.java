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

		// initializing arrays
		String[] athleteName = new String[numAthletes];
		double[] athleteBMI = new double[numAthletes];
		String[] athleteBMICategory = new String[numAthletes];
		int[] maxHeartRate = new int[numAthletes];
		double[] trainingMHR = new double[numAthletes];

		// calling methods and passing arrays to fill data, display data after
		// calculating BMI/category and MHR.
		inputAthleteData(numAthletes, athleteName, athleteBMI, maxHeartRate);
		categorizeBMI(numAthletes, athleteBMI, athleteBMICategory);
		displayAthleteData(numAthletes, athleteName, athleteBMI, maxHeartRate,
				athleteBMICategory);

		// call methods to customize array display: outside normal BMI, above
		// average MHR
		displayOutsideNormalBMI(numAthletes, athleteName, athleteBMICategory);
		averageMHR = calculateAverageMHR(numAthletes, maxHeartRate);
		findHighestMHR(numAthletes, maxHeartRate, athleteName);
		displayAboveAverageMHR(numAthletes, maxHeartRate, averageMHR,
				athleteName);
		calculateTrainingHeartRate(numAthletes, athleteName, maxHeartRate);

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
			double[] athleteBMI, int[] maxHeartRate)

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

	public static void categorizeBMI(int numAthletes, double[] athleteBMI,
			String[] athleteBMICategory)
	{

		for (int index = 0; index < numAthletes; index++)
		{
			if (athleteBMI[index] < 18.5)
			{
				athleteBMICategory[index] = "Underweight";
			} else if (athleteBMI[index] < 25.0)
			{
				athleteBMICategory[index] = "Normal";
			} else if (athleteBMI[index] < 30.0)
			{
				athleteBMICategory[index] = "Overweight";
			} else
			{
				athleteBMICategory[index] = "Obese";
			}
		}

	}
	public static void displayAthleteData(int numAthletes, String[] athleteName,
			double[] athleteBMI, int[] maxHeartRate,
			String[] athleteBMICategory)
	{
		// For loop to print out athletes to make sure arrays are stored
		// properly and names are printed. Delete once code works.
		for (int index = 0; index < numAthletes; index++)
		{
			System.out.printf("\n\nAthlete " + (index + 1) + ": " + "\n"
					+ athleteName[index]);
			System.out.printf("\nBMI: %.1f", athleteBMI[index]);
			System.out.printf("\nBMI Category: " + athleteBMICategory[index]);
			System.out.printf("\nMHR: " + maxHeartRate[index]);
		}
	}
	public static void displayOutsideNormalBMI(int numAthletes,
			String[] athleteName, String[] athleteBMICategory)
	{
		// boolean to break loops early if all athletes are categorized as
		// normal
		boolean found = false;

		// Checks to see if any athlete is outside of the normal BMI category
		for (int index = 0; index < numAthletes; index++)
		{
			if (!athleteBMICategory[index].equals("Normal"))
			{
				found = true;
				break;
			}
		}

		// if previous loop verifies none are outside of normal, prints message,
		// returns to main.
		if (!found)
		{
			System.out.println("\nNo athletes outside of normal range");
			return;
		}

		// Otherwise, code will print out athletes outside normal BMI range
		// by checking string category and using an indexed for loop
		// to print categories that aren't in normal range

		System.out.println("\nAthletes outside normal BMI range:");

		for (int index = 0; index < numAthletes; index++)
		{
			if (athleteBMICategory[index].equals("Underweight"))
			{
				System.out.println("Below normal: " + athleteName[index]);
			} else if (athleteBMICategory[index].equals("Overweight")
					|| athleteBMICategory[index].equals("Obese"))
			{
				System.out.println("Above normal: " + athleteName[index]);
			}
		}
	}

	// Calculates sum of maxHeartRate array using a for loop, then returns
	// average by dividing
	// sum by numAthletes, which needs to be cast as double to compute average.
	public static double calculateAverageMHR(int numAthletes,
			int[] maxHeartRate)
	{
		double sum = 0.0;

		for (int index = 0; index < numAthletes; index++)
		{
			sum += maxHeartRate[index];
		}

		System.out.printf(
				"\n**Average MHR is: " + (sum / (double) numAthletes) + "**");

		return sum / (double) numAthletes;
	}

	// Finds highest MHR value by searching with for loop, then uses value
	// to indicate index location, display name with index location.
	public static void findHighestMHR(int numAthletes, int[] maxHeartRate,
			String[] athleteName)
	{
		int highestMHR = 0;

		for (int index = 1; index < numAthletes; index++)
		{
			if (maxHeartRate[index] > maxHeartRate[highestMHR])
			{
				highestMHR = index;
			}
		}

		System.out.printf("\n\n**Athlete with the highest MHR: **");
		System.out.printf("\n" + athleteName[highestMHR]);

		return;
	}

	public static void displayAboveAverageMHR(int numAthletes,
			int[] maxHeartRate, double averageMHR, String[] athleteName)
	{
		System.out.printf("\n\n**Athletes at or above average MHR: **");

		for (int index = 0; index < numAthletes; index++)
		{
			if (maxHeartRate[index] >= averageMHR)
			{
				System.out.printf(
						"\n" + athleteName[index] + ": " + maxHeartRate[index]);
			}
		}
	}

	public static void calculateTrainingHeartRate(int numAthletes,
			String[] athleteName, int[] maxHeartRate)
	{
		char continueResponse;

		boolean valid = true;

		do
		{
			System.out.print(
					"\nDo you want to calculate the training heart rates? (y/n): ");
			continueResponse = input.next().toUpperCase().charAt(0);

			if (continueResponse == 'Y')
			{
				double percentage;

				do
				{
					System.out.print("\nEnter training percentage: ");

					while (!input.hasNextDouble())
					{
						System.out.println(
								"Error: value must be greater than 0.");
						input.next();
					}

					percentage = input.nextDouble();

					if (percentage <= 0)
					{
						System.out.println(
								"Error: value must be greater than 0.");
					}

				} while (percentage <= 0);

				input.nextLine(); // clear buffer

				for (int index = 0; index < numAthletes; index++)
				{
					double trainingHR = maxHeartRate[index]
							* (percentage / 100.0);
					System.out.printf("%s Training Heart Rate: %.1f\n",
							athleteName[index], trainingHR);
				}

				System.out.println("\n**Training Program Analysis complete**");
				valid = false;
				return;
			}
			if (continueResponse == 'N')
			{
				System.out.println("\n**Training Program Analysis complete**");
				valid = false;
				return;
			} else
			{
				System.out.println("Error. Please enter y, Y, n, or N: ");
			}

		} while (valid);
	}
}