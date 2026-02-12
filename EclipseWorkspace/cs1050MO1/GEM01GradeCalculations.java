
/*
 *  Name: [Warren]
 *  Class: CS1050 (T/TH)
 *  Description: Guided Exploration 01      
 *  The program will calculate a final grade for this class based on the category weights 
 */

public class GEM01GradeCalculations
{
	public static void main(String[] args)
	{

		// Removed input scanner until after next module

		// Declare Constants and assign values
		// Declared as double to attain decimal
		// Constants are all caps
		final double CLASS_PART = 0.15;
		final double GUIDED_EXP = 0.20;
		final double QUIZZES = 0.25;
		final double PROJECTS = 0.20;
		final double FINAL_DEM = 0.20;

		// Declare Variables and assign values with equation and operators
		// Variables are camelCase, start with lowercase
		// classPartGrade originally 95
		double classPartGrade = 89.99 * CLASS_PART;
		double guidedExpGrade = 92 * GUIDED_EXP;
		double quizzesGrade = 88 * QUIZZES;
		double projectsGrade = 87 * PROJECTS;
		double finalDemGrade = 93 * FINAL_DEM;

		// Calculate total average using equation
		double totalGrade = classPartGrade + guidedExpGrade + quizzesGrade
				+ projectsGrade + finalDemGrade;

		if (totalGrade >= 90)
		{
			System.out.println("Total Grade is an A! ");
		} else if (totalGrade >= 80)
		{
			System.out.println("Total Grade is a B!");
		} else if (classPartGrade >= 70)
		{
			System.out.println("Total Grade is a C!");
		}

		// Output average with string
		System.out.println("Warren's grade is " + totalGrade + " Out of 100.");

	}// main

}// Class GE01
