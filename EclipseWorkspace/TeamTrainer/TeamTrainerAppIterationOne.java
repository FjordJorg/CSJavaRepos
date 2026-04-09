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
		final double BMI_US_FACTOR = 703;
		int weight = 0;
		int height = 0;
		int age = 0;
		int numAthletes = 0;
		final double BMI = (weight / (height * height) * BMI_US_FACTOR);
		double sumMHR = 0.0;
		double averageMHR = 0.0;
		double highestMHR = 0.0;
		String[] athleteName = new String[numAthletes];
		int[] athleteAge = new int[numAthletes];
		int[] athleteHeight = new int[numAthletes];
		int[] athleteWeight = new int[numAthletes];
		double[] athleteBMI = new double[numAthletes];
		String[] athleteBMICategory = new String[numAthletes];
		double[] maxHeartRate = new double[numAthletes];
		double[] trainingMHR = new double[numAthletes];

	}

}
