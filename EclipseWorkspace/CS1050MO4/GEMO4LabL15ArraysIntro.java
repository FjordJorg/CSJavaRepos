/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: MOD4 Grades, create parallel arrays of student names, grades, pass arrays to methods to calculate sum, 
 *  average, and print names and grades of students at or above average.

 *    

 */
import java.util.Scanner;

public class GEMO4LabL15ArraysIntro
{
	static Scanner input = new Scanner(System.in);

	// main creates and passes arrays to methods to fill, calculate sum,
	// average,
	// passes to method to print names and scores of students at or above
	// average
	public static void main(String[] args)
	{

		System.out.print("How many students? ");
		int amountStudents = input.nextInt();
		input.nextLine();

		String[] firstNames = new String[amountStudents];
		double[] finalGrades = new double[amountStudents];
		inputNamesAndGrades(amountStudents, finalGrades, firstNames);

		double totalSum = sumGrades(finalGrades);
		double average = averageGrades(finalGrades, totalSum);

		displayAverage(finalGrades, average, firstNames);

		input.close();
	}

	// method to fill names and grades as parallel arrays
	public static void inputNamesAndGrades(int amountStudents,
			double[] finalGrades, String[] firstNames)

	{

		// for loop index = 0 so the arrays track same position while the loop
		// increments
		// up to amountStudents
		for (int index = 0; index < amountStudents; index++)
		{
			System.out.println(
					"Enter the name for student " + (index + 1) + ": ");
			firstNames[index] = input.nextLine();
			System.out
					.println("Enter the grade for " + firstNames[index] + ": ");
			finalGrades[index] = input.nextDouble();
			input.nextLine(); // clears line for input, otherwise will cause
								// error

		}

		return;

	}

	// method uses for loop to accumulate sum
	public static double sumGrades(double[] finalGrades)
	{
		double totalSum = 0;

		for (int index = 0; index < finalGrades.length; index++)
		{
			totalSum += finalGrades[index]; // += accumulates and stores added
											// values

		}

		return totalSum;
	}

	// method calculates sum, will return if arrays are empty
	public static double averageGrades(double[] finalGrades, double totalSum)
	{
		if (finalGrades.length == 0)
			return 0;
		double average = totalSum / finalGrades.length;
		return average;
	}

	// method will print names and scores of students at or above average
	public static void displayAverage(double[] finalGrades, double average,
			String[] firstNames)
	{
		for (int index = 0; index < finalGrades.length; index++)
		{
			if (finalGrades[index] >= average)
			{
				System.out.printf("\n" + firstNames[index]
						+ " scored at or above average with a grade of: %.2f",
						finalGrades[index]); // %.2f must use comma, not
												// concatenation, printf, not
												// prinln
			}
		}
		return;
	}

}