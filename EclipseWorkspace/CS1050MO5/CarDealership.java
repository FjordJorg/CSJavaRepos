/**
 * Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: Program to practice creating classes. 2 classes: Car, Dealership.
 *  Car class will take make, model, and price. Dealership can enter a name, 
 *  be able to add multiple Cars to an array that the Dealership class stores,
 *  where various methods can display the most expensive car, current number of cars,
 *  add cars, and eventually read/write a list of cars from a file. 
 */

import java.util.Scanner;

public class CarDealership
{
	static Scanner input = new Scanner(System.in);

	/**
	 * @param args
	 * 
	 *            Main method to call and test Car & Dealership classes.
	 */
	public static void main(String[] args)
	{

		String make = Car.getMake();
		String model = Car.getModel();
		double price = Car.getPrice();

		Car car1 = new Car(make, model, price);

		car1.displayCarDetails();

		String dealershipName = Dealership.getDealershipName();

		System.out.println(dealershipName);

	}

	/**
	 * Creating a static class for Car, setting private attributes. Static class
	 * allows main to access, private means only the code can access/use the
	 * variables.
	 * 
	 * make, model, price.
	 */
	static class Car
	{
		// Attributes/instance variables for class
		private String make;
		private String model;
		private double price;

		// Constructor: used to construct new Cars using specified parameters
		public Car(String make, String model, double price)
		{
			this.make = make;
			this.model = model;
			this.price = price;

		}

		// Class method(s)
		public void displayCarDetails()
		{
			System.out.printf("\n***Car details*** \nMake: " + make
					+ "\nModel: " + model + "\nPrice: $" + price);
		}

		/**
		 * @return make
		 */
		public static String getMake()
		{
			System.out.println("Enter make: ");
			String make = input.nextLine();
			return make;
		}

		/**
		 * @return model
		 */
		public static String getModel()
		{
			System.out.println("Enter model: ");
			String model = input.nextLine();
			return model;
		}

		/**
		 * @return price Validates that number is valid for price
		 * 
		 */
		public static double getPrice()
		{
			System.out.println("Enter price: ");

			while (!input.hasNextDouble())
			{
				System.out
						.print("Error, please enter a number greater than 0: ");
				input.next();
			}

			double price = input.nextDouble();

			if (price <= 0)
			{
				System.out.println(
						" Error, please enter a number greater than 0: ");
			}
			input.nextLine();
			return price;
		}
	} // End of Car Class

	/**
	 * 
	 */
	static class Dealership
	{
		// Attributes
		private String dealershipName;
		private Car[] carsInventory;
		private int currentNumCars;

		// Constructor
		public Dealership(String dealershipName, int maxNumCars)
		{
			this.dealershipName = dealershipName;
			this.carsInventory = new Car[maxNumCars];
			this.currentNumCars = 0;
		}

		// Class methods
		public static String getDealershipName()
		{
			System.out.printf("\nEnter Dealership Name: ");
			String dealershipName = input.nextLine();
			return dealershipName;
		}

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

	} // End of Dealership Class

}
