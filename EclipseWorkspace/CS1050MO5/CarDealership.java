/**
 * 
 */

import java.util.Scanner;

public class CarDealership
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{

		String make = getMake();
		String model = getModel();
		double price = getPrice();

		Car c1 = new Car(make, model, price);

		c1.displayCarDetails();
	}

	static class Car
	{
		private String make;
		private String model;
		private double price;

		public Car(String make, String model, double price)
		{
			this.make = make;
			this.model = model;
			this.price = price;

		}

		public void displayCarDetails()
		{
			System.out.printf("\n***Car details*** \nMake: " + make
					+ "\nModel: " + model + "\nPrice: $" + price);
		}
	}

	public static String getMake()
	{
		System.out.println("Enter make: ");
		String make = input.nextLine();
		return make;
	}

	public static String getModel()
	{
		System.out.println("Enter model: ");
		String model = input.nextLine();
		return model;
	}

	public static double getPrice()
	{
		System.out.println("Enter price: ");
		double price = input.nextDouble();
		input.nextLine();
		return price;
	}

}
