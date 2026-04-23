/**
 * 
 */

import java.util.Scanner;

public class CarDealership
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter make: ");
		make = input.next();

		System.out.println("Enter model: ");
		model = input.next();

		System.out.println("Enter price: ");
		price = input.nextDouble();

		class Car
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

			public String getMake(String make)
			{
				make = input.next();
				return make;
			}

			public String getModel(String model)
			{
				model = input.next();
				return model;
			}

			public static double getPrice(double price)
			{
				price = input.nextDouble();
				return price;
			}

			public static void getCarDetails(String make, String model,
					double price, int[] totalCars)
			{

			}

			public void displayCarDetails()
			{
				System.out.printf("\nCar details: " + make + "\n " + model
						+ "\nPrice: " + price);
			}

		}
	}

}
