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
		final double BMI_US_FACTOR = 703;
		int numAthletes = 0;
		double sumMHR = 0.0;
		double averageMHR = 0.0;
		double highestMHR = 0.0;
		String[] athleteName = new String[numAthletes];
		double[] athleteBMI = new double[numAthletes];
		String[] athleteBMICategory = new String[numAthletes];
		double[] maxHeartRate = new double[numAthletes];
		double[] trainingMHR = new double[numAthletes];

		// organizing methods
		inputAthleteData(numAthletes, athleteName);

		for (int index = 0; index < numAthletes; index++)
		{
			System.out.printf("\nAthletes names are: " + athleteName[index]);
		}
	}

	public static void inputAthleteData(int numAthletes, String[] athleteName)

	{

		System.out.println("Enter the number of athletes: ");
		numAthletes = input.nextInt();

		// for loop index = 0 so the arrays track same position while the loop
		// increments
		// up to amountStudents
		for (int index = 0; index < numAthletes; index++)
		{
			System.out.println(
					"Enter the name for athlete " + (index + 1) + ": ");
			athleteName[index] = input.nextLine();
			input.nextLine(); // clears line for input, otherwise will cause
								// error
		}

		return;
	}
}
