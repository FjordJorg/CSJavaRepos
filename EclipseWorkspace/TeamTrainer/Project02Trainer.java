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

// A File object identifies the target file.
// A Scanner or PrintWriter is initialized using that File to read or write data.
// Java requires you to handle a potential FileNotFoundException using a 
// try-catch block or a throws declaration.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Project02Trainer
{
	public static void main(String[] args)
	{
		displayProgramSummary();

		// ===== TEST 1 =====
		String fileName = "team1.txt"; // Can't find file anywhere,
		// assumed to be for grade/testing
		// Initializes fileName to pass to teamSetUp below

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
		// Updated fileName allows for second file to be written
		// for a second team 'Team CS' below

		try
		{
			System.out.println("\nTesting file: " + fileName);

			// Initialize Team object, hardcoded size to match specific sample
			// outputs
			Team team = new Team("Team CS", 4); // 5 listed, could change
			// To 5 to resolve error. I'm assuming this is so that the file
			// matches the expected output for the Sample output.

			// Attempt to read data and analyze it
			teamSetUp(fileName, team);

			runAnalysis(team);

		} catch (FileNotFoundException exception)// handles missing files
													// instead of crashing
		{

			System.out.println("Error: Unable to find file " + fileName);
		}

		System.out.println("\nEnd of program");
	}

	/**
	 * Method reads athlete data from a file and adds them to a specified Team.
	 * Method requires team name, max number of athletes, and the fileName (ex:
	 * team2.txt above).
	 * 
	 * @param fileName
	 * @param team
	 * @throws FileNotFoundException
	 */
	public static void teamSetUp(String fileName, Team team)
			throws FileNotFoundException// throws FileNotFoundException
	// If the specified file cannot be located
	{
		// Initialize the file and a scanner to read its content
		File inputFile = new File(fileName);
		Scanner fileScanner = new Scanner(inputFile);

		// Continue reading as long as there is more data in the file
		while (fileScanner.hasNext())
		{
			// Read the four required attributes for an athlete
			String name = fileScanner.next();
			double weight = fileScanner.nextDouble();
			double height = fileScanner.nextDouble();
			int age = fileScanner.nextInt();

			// Create a new Athlete object and add it to the team athletes[]
			// array
			Athlete athlete = new Athlete(name, weight, height, age);
			team.addAthlete(athlete);
		}

		// Close the scanner to prevent memory leaks
		fileScanner.close();
	}

	/**
	 * Method prints a summary of team and athlete data to the console,
	 * calculates average max heart rates, displays (BMI, heart rate), and
	 * writes this data to a text file named after the team, potentially
	 * throwing a FileNotFoundException
	 * 
	 * @param team
	 * @throws FileNotFoundException
	 */
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

		// Writes fileName as the teamName
		String outputFileName = team.getTeamName() + ".txt";
		// Calls method to write all athletes in athletes[] array to
		// updated fileName
		team.writeAthletesToFile(outputFileName);

	}

	// ================= DISPLAY =================

	/**
	 * Method displays header message to console output describing program's
	 * functions
	 */
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

/**
 * Athlete class serves as a blueprint for creating athlete objects. Represents
 * a single athlete with attributes: name, weight, height, and age.
 * 
 */
class Athlete
{
	// Private attributes to ensure encapsulation
	private String name;
	private double weight;
	private double height;
	private int age;

	/**
	 * Athlete constructors constructs a new athlete instance with these
	 * details: name, weight, height, and age.
	 * 
	 * @param name
	 * @param weight
	 * @param height
	 * @param age
	 */
	public Athlete(String name, double weight, double height, int age)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}

	// Class methods
	/**
	 * Getter returns the athlete's name
	 * 
	 * @return name
	 */
	String getName()
	{
		return name;
	}

	/**
	 * Getter returns the athlete's height
	 * 
	 * @return height
	 */
	public double getHeight()
	{
		return height;
	}

	/**
	 * Method calculates BMI using US CDC BMI calculation index: weight *
	 * 703(BMI US Factor) / (height * height)
	 * 
	 * @return bmi
	 */
	public double calculateBMI()
	{
		double BMI_US_FACTOR = 703;
		double bmi = (weight * BMI_US_FACTOR) / (height * height);
		return bmi;
	}// End calculateBMI

	/**
	 * Method determines and returns BMI Category based on US CDC BMI
	 * Calculation index categories: Underweight is below 18.5, Normal is 18.5
	 * to less than 25.0, Overweight is 25.0 to less than 30.0, Obese is 30.0 or
	 * higher
	 * 
	 * @param bmi
	 * @return Category (Underweight, Normal, Overweight, Obese)
	 */
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

	/**
	 * Method calculates and returns max heart rate using formula 220 - age
	 * 
	 * @return maxHeartRate
	 */
	public int calculateMaxHeartRate()
	{
		int maxHeartRate = 220 - age;
		return maxHeartRate;
	}

	/**
	 * Method displays the athlete’s name, BMI, BMI category, max heart rate.
	 * 
	 */
	public void displayAthleteAnalysis()
	{
		double bmi = calculateBMI();

		// \n new line
		// %s String
		// %.2f second decimal place
		// %d integer
		System.out.printf(
				"\nName: %s\nBMI: %.2f\nBMI category: %s\nMax Heart Rate: %d",
				name, bmi, determineBMICategory(bmi), calculateMaxHeartRate());
	}
} // End of Athlete class

// ================= ADD TEAM CLASS =================

/**
 * Team class serves as a blueprint for creating team objects. Represents a team
 * with these attributes: team name, array of athletes in team, athleteCount as
 * number of athlete objects in athlete array.
 * 
 */
class Team
{
	// Attributes
	private String teamName;
	private Athlete[] athletes;
	private int athleteCount;

	// Constructors
	/**
	 * Team constructors construct a new team instance with these specified
	 * details: teamName (name of team), athletes[] array initialized to
	 * maxAthletes value, athleteCount initialized to 0. maxAthletes determines
	 * maximum size of array, athleteCount represents number of athletes added
	 * to the array.
	 * 
	 * @param teamName
	 * @param maxAthletes
	 */
	public Team(String teamName, int maxAthletes)
	{
		this.teamName = teamName;
		this.athletes = new Athlete[maxAthletes];
		this.athleteCount = 0;
	}

	// Class methods
	/**
	 * Getter returns team name to Team instance object
	 * 
	 * @return teamName
	 */
	public String getTeamName()
	{
		return teamName;
	}

	/**
	 * Getter returns athleteCount to Team instance object
	 * 
	 * @return athleteCount
	 */
	public int getAthleteCount()
	{
		return athleteCount;
	}

	/**
	 * Method adds new athlete instance object to athletes[] array as long as
	 * the athleteCount is less than or equal to maxAthletes
	 * 
	 * @param athlete
	 */
	public void addAthlete(Athlete athlete)
	{
		if (athleteCount < athletes.length)
		{
			athletes[athleteCount] = athlete;
			athleteCount++;
		} else
		{
			System.out.println("Team is Full. Can't add " + athlete.getName());
		}

	} // End addAthlete

	/**
	 * Method calls displayAthleteAnalysis method to display the name, bmi, bmi
	 * category, and max heart rate for each athlete object in athlete[] array
	 */
	public void displayAthleteResults()
	{
		System.out.printf("\n***** Athlete details *****\n");

		for (int index = 0; index < athleteCount; index++)
		{
			athletes[index].displayAthleteAnalysis();
			System.out.println();
		}
	}

	/**
	 * Method calls calculateBMI to return bmi to categorize each athlete
	 * instance in athlete[] array to display any athlete above or below the
	 * normal bmi range 18.5 to 25.0. If all athletes are in normal range,
	 * displays All athletes are within the normal BMI range.
	 * 
	 */
	public void displayAthletesOutsideNormalBMI()
	{
		boolean found = false;// flagged so that if all athletes are normal,
		// program acknowledges
		System.out.printf("\nAthletes Outside Normal BMI Range: \n");

		// Use athleteCount instead of athletes.length
		for (int index = 0; index < athleteCount; index++)
		{
			double bmi = athletes[index].calculateBMI();// track bmi for indexed
			// athlete during loop
			String name = athletes[index].getName();// track name for indexed
			// athlete during loop

			if (bmi >= 25.0)
			{
				System.out.println("Above Normal: " + name);
				found = true;
			} else if (bmi < 18.5)
			{
				System.out.println("Below Normal: " + name);
				found = true;
			}

		}

		if (!found)// flag if all athletes are in normal BMI category
		{
			System.out.println("All athletes are within the normal BMI range.");
		}

	}

	/**
	 * Method calculates and returns average max heart rate of athlete[] array
	 * using indexed for loop to accumulate the sum of each athletes' heart
	 * rate, and dividing the sum by athleteCount to attain and return average.
	 * 
	 * @return avg
	 */
	public double calculateAverageMaxHeartRate()
	{
		double sum = 0.0;
		double avg = 0.0;

		for (int index = 0; index < athleteCount; index++)
		{
			sum += athletes[index].calculateMaxHeartRate();
		}

		avg = sum / (double) athleteCount;
		return avg;
	}

	/**
	 * Method compares max heart rate of each athlete in athletes[] array to the
	 * average max heart rate and displays all athlete name(s) above or equal to
	 * average.
	 * 
	 * @param avg
	 */
	public void displayAthletesAboveAverageMHR(double avg)
	{
		System.out.printf("\nAthletes above or equal to average MHR: \n");

		for (int index = 0; index < athleteCount; index++)
		{
			int maxHeartRate = athletes[index].calculateMaxHeartRate();

			if (maxHeartRate >= avg)
			{
				System.out.println(athletes[index].getName());
			}
		}
	}

	/**
	 * Method uses for loop and index location to find highest max heart rate in
	 * athletes[] array and displays name of that athlete with their max heart
	 * rate value.
	 */
	public void displayHighestMHR()
	{
		System.out.printf("\nHighest Max Heart Rate: \n");

		int max = athletes[0].calculateMaxHeartRate();// max initialized to
														// track
		// highest heart rate value
		int highestIndex = 0;// highestIndex to track index location to display
		// athlete name below

		for (int index = 0; index < athleteCount; index++)
		{
			// Initializing new variable to track highest value
			int currentHeighest = athletes[index].calculateMaxHeartRate();

			// max stores currentHeighest value until highest is found
			// highestIndex saves index location of highest value
			if (currentHeighest > max)
			{
				max = currentHeighest;
				highestIndex = index;
			}

		}

		System.out.printf(athletes[highestIndex].getName() + ": " + max + "\n");

	}

	/**
	 * Method uses for loop and an index for shortest and an index for tallest
	 * to find the shortest and tallest athletes in athletes[] array, stores the
	 * highest and stores the lowest value and their index locations, then
	 * displays shortest, and displays tallest.
	 */
	public void displaySmallestLargestHeight()
	{
		double tallest = athletes[0].getHeight();
		int tallestIndex = 0;
		double shortest = athletes[0].getHeight();
		int shortestIndex = 0;

		for (int index = 0; index < athleteCount; index++)
		{
			double currentHeight = athletes[index].getHeight();

			if (currentHeight > tallest)
			{
				tallest = currentHeight;
				tallestIndex = index;
			}

			if (currentHeight < shortest)
			{
				shortest = currentHeight;
				shortestIndex = index;
			}
		}

		System.out.printf("\nShortest Athlete: %s %.0f inches",
				athletes[shortestIndex].getName(),
				athletes[shortestIndex].getHeight());

		System.out.printf("\nTallest Athlete: %s %.0f inches\n",
				athletes[tallestIndex].getName(),
				athletes[tallestIndex].getHeight());
	}

	/**
	 * Method Writes output to a file named [team name].txt in same directory as
	 * the java file. It then displays the location of the file. Writes in the
	 * following format with each section on a new line: Team: [team name] Total
	 * Athletes:[number of athletes] (Athlete name) [Athlete name] BMI: [BMI to
	 * 2 decimal places] Category: [BMI Category] MHR [MHR]
	 * 
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public void writeAthletesToFile(String fileName)
			throws FileNotFoundException
	{
		File outputFile = new File(fileName);
		PrintWriter fileWriter = new PrintWriter(outputFile);

		fileWriter.printf(
				"Team: " + teamName + "\nTotal Athletes: " + athleteCount);
		fileWriter.println(); // added lines between team and athletes
		// for file readability, delete to match acceptance criteria exactly

		for (int index = 0; index < athleteCount; index++)
		{
			// creating a local variable named
			// athlete and assigning it the
			// reference to the Athlete
			// object located at the current
			// index in the athletes array.
			// used as a shortcut to call methods for each athlete below
			Athlete athlete = athletes[index];

			double bmi = athletes[index].calculateBMI();

			fileWriter.printf("\n%s\nBMI: %.2f\nCategory: %s\nMHR: %d\n",
					athlete.getName(), bmi, athlete.determineBMICategory(bmi),
					athlete.calculateMaxHeartRate());// added lines between
														// athletes
			// for file readability, delete first \n to match acceptance
			// criteria exactly
		}

		fileWriter.close();

		// Prints file path for convenience
		System.out.println(
				"\nResults written to file: " + outputFile.getAbsolutePath());
	}
} // End of Team class
