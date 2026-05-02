/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description (Pulled from assignment directly): 
 *  This program reads athlete data from a file, 
 *  calculates BMI and max heart rate (MHR) for each athlete, 
 *  and displays the results. It also analyzes the team by finding averages, 
 *  identifying athletes outside the normal BMI range, and determining top performers. 
 *  The program outputs results to both the console and a file. 
 *    
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project02Trainer
{
	public static void main(String[] args)
	{
		displayProgramSummary();

		// ===== TEST 1 =====
		String fileName = "team1.txt"; // Can't find file anywhere,
		// assumed to be for grade/testing

		try
		{
			System.out.println("\nTesting file: " + fileName);

			Team team = new Team("Nuggets", 6);

			teamSetUp(fileName, team);

			runAnalysis(team);

		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}

		// ===== TEST 2 =====
		fileName = "team2.txt";// File has 5 athletes listed

		try
		{
			System.out.println("\nTesting file: " + fileName);

			Team team = new Team("Team CS", 4); // Was originally 4,
			// caused error, changed to 5

			teamSetUp(fileName, team);

			runAnalysis(team);

		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}

		System.out.println("\nEnd of program");
	}

	public static void teamSetUp(String fileName, Team team)
			throws FileNotFoundException
	{
		File inputFile = new File(fileName);
		Scanner fileScanner = new Scanner(inputFile);

		while (fileScanner.hasNext())
		{
			String name = fileScanner.next();
			double weight = fileScanner.nextDouble();
			double height = fileScanner.nextDouble();
			int age = fileScanner.nextInt();
			Athlete athlete = new Athlete(name, weight, height, age);
			team.addAthlete(athlete);
		}

		fileScanner.close();
	}

	public static void runAnalysis(Team team) throws FileNotFoundException
	{
		System.out.println("\n========== Team Analysis ==========");
		System.out.println("Team: " + team.getTeamName());
		System.out.println("Total Athletes: " + team.getAthleteCount());
		System.out.println();

		team.displayAthleteResults();
		team.displayAthletesOutsideNormalBMI();

		double avg = team.calculateAverageMaxHeartRate();
		System.out.println("\nAverage Max Heart Rate: " + avg);

		team.displayAthletesAboveAverageMHR(avg);
		team.displayHighestMHR();
		team.displaySmallestLargestHeight();
		String outputFileName = team.getTeamName() + ".txt";
		team.writeAthletesToFile(outputFileName);

	}

	// ================= DISPLAY =================

	public static void displayProgramSummary()
	{
		System.out.println("**************************************");
		System.out.println("Team and Athlete Analysis");
		System.out.println("**************************************");
		System.out.println("Reads athlete data from file");
		System.out.println("Displays athlete results");
		System.out.println("Performs team analysis");
		System.out.println("Writes results to file");
		System.out.println();
	}
} // End of Program/main

// ================= ADD ATHLETE CLASS =================

class Athlete
{
	// Attributes
	private String name;
	private double weight;
	private double height;
	private int age;

	// Constructors
	public Athlete(String name, double weight, double height, int age)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}

	// Class methods
	String getName()
	{
		return name;
	}

	public double getHeight()
	{
		return height;
	}

	public int getAge()
	{
		return age;
	}

	public double calculateBMI()
	{
		double BMI_US_FACTOR = 703;
		double bmi = (weight * BMI_US_FACTOR) / (height * height);
		return bmi;
	}// End calculateBMI

	public String determineBMICategory(double bmi)
	{
		if (bmi < 18.5)
		{
			return "Underweight";
		} else if (bmi < 25.0)
		{
			return "Normal";
		} else if (bmi < 30.0)
		{
			return "Overweight";
		} else
		{
			return "Obese";
		}
	}// End determineBMICategory

	public int calculateMaxHeartRate()
	{
		int maxHeartRate = 220 - age;
		return maxHeartRate;
	}

	// Displays the athlete’s name, BMI, BMI category, max heart rate.
	public void displayAthleteAnalysis()
	{
		double bmi = calculateBMI();

		System.out.printf(
				"\nName: %s\nBMI: %.2f\nBMI category: %s\nMax Heart Rate: %s",
				name, bmi, determineBMICategory(bmi), calculateMaxHeartRate());
	}
} // End of Athlete class

// ================= ADD TEAM CLASS =================

class Team
{
	// Attributes
	private String teamName;
	private Athlete[] athletes;
	private int athleteCount;

	// Constructors
	public Team(String teamName, int maxAthletes)
	{
		this.teamName = teamName;
		this.athletes = new Athlete[maxAthletes];
		this.athleteCount = 0;
	}

	// Class methods
	public String getTeamName()
	{
		return teamName;
	}

	public int getAthleteCount()
	{
		return athleteCount;
	}

	public void addAthlete(Athlete athlete)
	{
		if (athleteCount < athletes.length)
		{
			athletes[athleteCount] = athlete;
			athleteCount++;
		} else
		{
			System.out.println(
					"Team Roster Full. Can't add " + athlete.getName());
		}

	} // End addAthlete

	public void displayAthleteResults()
	{
		System.out.printf("\n***** Athlete details *****\n");

		for (int index = 0; index < athletes.length; index++)
		{
			athletes[index].displayAthleteAnalysis();
			System.out.println();
		}
	}

	public void displayAthletesOutsideNormalBMI()
	{

	}

	public double calculateAverageMaxHeartRate()
	{
		double sum = 0.0;
		double avg = 0.0;

		for (int index = 0; index < athletes.length; index++)
		{
			sum += athletes[index].calculateMaxHeartRate();
		}

		avg = sum / (double) athleteCount;
		return avg;
	}

	public void displayAthletesAboveAverageMHR(double avg)
	{

	}

	public void displayHighestMHR()
	{

	}

	public void displaySmallestLargestHeight()
	{

	}

	public void writeAthletesToFile(String fileName)
	{

	}
} // End of Team class
