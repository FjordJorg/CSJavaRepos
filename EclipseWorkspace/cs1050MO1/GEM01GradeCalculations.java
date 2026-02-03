
/*
 *  Name: [Warren]
 *  Class: CS1050 (T/TH)
 *  Description: Guided Exploration 01      
 *  The program will calculate a final grade for this class based on the category weights 
 */

public class GE01Calculation
{
	public static void main(String[] args)
	{

		final double CLASS_PART = 0.15;
		final double GUIDED_EXP = 0.20;
		final double QUIZZES = 0.25;
		final double PROJECTS = 0.20;
		final double FINAL_DEM = 0.20;

		double ClassPartGrade = 95 * CLASS_PART;
		double GuidedExpGrade = 92 * GUIDED_EXP;
		double QuizzesGrade = 88 * QUIZZES;
		double ProjectsGrade = 87 * PROJECTS;
		double FinalDemGrade = 93 * FINAL_DEM;

		double TotalGrade = ClassPartGrade + GuidedExpGrade + QuizzesGrade
				+ ProjectsGrade + FinalDemGrade;

		System.out.println("Your grade is " + TotalGrade);

	}// main

}// Class GE01
