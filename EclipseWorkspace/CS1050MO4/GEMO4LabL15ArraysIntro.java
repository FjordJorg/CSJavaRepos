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

		String[] firstNames = new String[amountStudents];

		System.out.print("Enter the names of each student: ");

		// for loop to fill array with as many names as inputted
		for (int i = 0; i < firstNames.length; i++)
		{
			System.out.print("Student " + (i + 1) + ": ");
			firstNames[i] = input.nextLine();
		}

		// Print names to verify
		for (int i = 0; i < firstNames.length; i++)
		{
			System.out.print("Student " + (i + 1) + ": ");
			firstNames[i] = input.nextLine();
		}

		int grades = input.nextInt();
		double[] numbers = new double[grades]; // Create an array
		double sum = 0;

	}

}
