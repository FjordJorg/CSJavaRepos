/**
 * Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: Program to practice creating classes. 2 classes: Car, Dealership.
 *  Car class will take make, model, and price. Dealership can enter a name, 
 *  be able to add multiple Cars to an array that the Dealership class stores,
 *  where various methods can display the most expensive car, current number of cars,
 *  add cars, and can read a list of cars from a file. 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DealershipTest
{
	static Scanner input = new Scanner(System.in);

	/**
	 * Main tests the reading of files and will display them all, making sure
	 * each method works properly.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		displayProgramSummary();
		String fileName = "Larrys_Luxury_Landboats.txt"; // Change to
															// "cars2.txt" to
															// test cars2.txt
		// Trying "Larrys_Luxury_Landboats.txt"

		try
		{
			System.out.println("\nTesting file: " + fileName);
			Dealership dealership = new Dealership("CS Dealership", 6);

			dealershipSetUp(fileName, dealership);

			dealership.displayCars();

			System.out.println("\nMost Expensive Car:");
			Car mostExpensive = dealership.findMostExpensiveCar();
			mostExpensive.displayCarDetails();

			String outputFileName = dealership.getDealershipName() + ".txt";
			dealership.writeCarsToFile(outputFileName);

		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}

		System.out.println("\nEnd of program");

	} // End of Main

	public static void dealershipSetUp(String fileName,
			Dealership newDealership) throws FileNotFoundException
	{
		File inputFile = new File(fileName);
		Scanner fileScanner = new Scanner(inputFile);

		while (fileScanner.hasNext())
		{
			String make = fileScanner.next();
			String model = fileScanner.next();
			double price = fileScanner.nextDouble();
			Car car = new Car(make, model, price);
			newDealership.addCar(car);
		}

		fileScanner.close();
	} // End of dealershipSetUp

	public static void displayProgramSummary()
	{
		System.out.println("**************************************");
		System.out.println("Dealership and Car Analysis");
		System.out.println("**************************************");
		System.out.println("Reads car data from a file");
		System.out.println("Displays all cars");
		System.out.println("Finds most expensive car");
		System.out.println();
	} // end displayProgramSummary

	/**
	 * Car class represents a single car with make, model, price. Static because
	 * it is nested within main class. Private variables can only be accessed
	 * within Car class.
	 */
	static class Car
	{
		// Attributes/instance variables for class
		private String make;
		private String model;
		private double price;

		// Constructors used to initialize a car with make, model, price
		public Car(String make, String model, double price)
		{
			this.make = make;
			this.model = model;
			this.price = price;

		}

		// Class method(s)
		public void displayCarDetails()
		{
			System.out.printf(
					"\n***** Car details *****\nMake: %s\nModel: %s\nPrice: $%.2f\n",
					make, model, price); // Formatted for clean output details
		}

		/**
		 * Initializes make of car
		 * 
		 * @return make
		 */
		public String getMake()
		{
			return make;
		}

		/**
		 * Initializes model of car
		 * 
		 * @return model
		 */
		public String getModel()
		{
			return model;
		}

		/**
		 * Initializes price of car
		 * 
		 * @return price
		 * 
		 */
		public double getPrice()
		{

			return price;
		}
	} // End of Car Class

	/**
	 * New class Dealership, private parameters to set name, current number of
	 * cars, initialize an array to add cars to its inventory
	 */
	static class Dealership
	{
		// Attributes
		private String dealershipName;
		private Car[] carsInventory;
		private int currentNumCars;

		/**
		 * public Dealership initializes dealership name, creates carsInventory
		 * array, sets current car count to 0.
		 * 
		 * @param dealershipName
		 * @param maxNumCars
		 */
		public Dealership(String dealershipName, int maxNumCars)
		{
			// Constructors
			this.dealershipName = dealershipName;
			this.carsInventory = new Car[maxNumCars];
			this.currentNumCars = 0;
		}

		// Class methods

		/**
		 * getter, gets Dealership Name
		 * 
		 * @return
		 */
		public String getDealershipName()
		{
			return dealershipName;
		}

		/**
		 * Adds new car to carsInventory array if there is space available
		 * 
		 * @param newCar
		 */
		public void addCar(Car newCar)
		{

			if (currentNumCars < carsInventory.length)
			{
				carsInventory[currentNumCars] = newCar;
				currentNumCars++;

				System.out.println("Successfully added. ");

			} else
			{
				System.out.println("Inventory full, cannot add new cars. ");
			}

		}

		/**
		 * Returns car with the highest price in the carsInventory array
		 * 
		 * @return mostExpensiveCar
		 */
		public Car findMostExpensiveCar()
		{
			if (currentNumCars == 0)
			{
				return null;
			}

			Car mostExpensiveCar = carsInventory[0];

			// For loop checks each car to find the one with the highest price
			for (int index = 0; index < currentNumCars; index++)
			{
				if (carsInventory[index].getPrice() > mostExpensiveCar
						.getPrice())
				{
					mostExpensiveCar = carsInventory[index];
				}
			}

			return mostExpensiveCar;
		}

		/**
		 * Displays all cars currently in carsInventory array
		 * 
		 */
		public void displayCars()
		{
			System.out.printf(
					"\n======== " + dealershipName + " Inventory ========\n");
			System.out
					.println("Current Number of Landboats: " + currentNumCars);

			for (int index = 0; index < currentNumCars; index++)
			{
				carsInventory[index].displayCarDetails();
				System.out.println("_________________________");
			}
		}

		/**
		 * Creates new file, writes dealership name on file, loops to write car
		 * details from carsInventory array in form: make,model,price. (no
		 * spaces) Then displays file path. Should handle exceptions.
		 * 
		 * @param outputFileName
		 * @throws FileNotFoundException
		 */
		public void writeCarsToFile(String outputFileName)
				throws FileNotFoundException
		{

			// Create new file
			File outputFile = new File(outputFileName);
			PrintWriter fileWriter = new PrintWriter(outputFile);

			// Write dealership name onto file
			fileWriter.println(dealershipName);

			// For loop writes each car details onto file, separates with comma
			// Will list as make,model,price in file
			for (int index = 0; index < currentNumCars; index++)
			{
				Car car = carsInventory[index];

				fileWriter.println(car.getMake() + " " + car.getModel() + " "
						+ car.getPrice());
			}

			fileWriter.close();

			// Prints file path for convenience
			System.out.println(
					"Data written to file: " + outputFile.getAbsolutePath());
		}

	} // End of Dealership Class

} // End program
