/**
 * 
 */
import java.util.Scanner;

public class GEMO4LabL15ArraysIntro
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{

		System.out.print("How many students? ");
		int amountStudents = input.nextInt();
		input.nextLine();

		String[] firstNames = inputFirstNames(amountStudents);
		double[] finalGrades = inputFinalGrades(amountStudents);

		for (int index = 0; index < amountStudents; index++)
		{
			System.out.printf("\nStudent: " + firstNames[index]
					+ " Has a grade of: " + finalGrades[index] + ". ");
		}

		// attempt to send grades for sum in new method
		double[] sum = sumGrades(finalGrades);

		input.close();
	}

	public static String[] inputFirstNames(int amountStudents)

	{
		String[] firstNames = new String[amountStudents];

		for (int index = 0; index < amountStudents; index++)
		{
			System.out.println(
					"Enter the name for student " + (index + 1) + ": ");

			firstNames[index] = input.nextLine();

		}

		return firstNames;

	}

	public static double[] inputFinalGrades(int amountStudents)

	{

		double[] finalGrades = new double[amountStudents];

		for (int index = 0; index < finalGrades.length; index++)
		{
			System.out.println("Enter the numeric grade of each student: ");
			finalGrades[index] = input.nextDouble();

		}

		return finalGrades;
	}

	public static void sumGrades(double finalGrades, double averages)
	{
		int sum = 0;
		
		
		for (double sum; sum < finalGrades; )
		
	}

}