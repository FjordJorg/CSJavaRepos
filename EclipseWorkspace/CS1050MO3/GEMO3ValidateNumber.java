/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: Validates if number is positive, then asks for a base decimal
 *  number, and a positive integer for an exponent, to correctly calculate a base and its
 *  exponent by using a loop, without Math.pow methods

 *    

 */
import java.util.Scanner;

public class GEMO3ValidateNumber
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int inputNum = 0;

		do
		{
			System.out.print("Please enter a positive value number ");
			inputNum = input.nextInt();
			if (inputNum <= 0)
			{
				System.out.println(" Error, not a valid exponent ");
				System.out.println(" Try again please ");
			}
		} while (inputNum <= 0);

		System.out.print("Your postivie number is " + inputNum + ".\n");

		// Added input for base number and separate for exponent number
		System.out
				.print("Please enter a base number value. Decimals allowed: ");
		double inputBase = input.nextDouble();

		// Bradley had inputNum as inputExpo, changed for clarity
		// inputBase * inputNum * inputNum doesn't provide valid exponential
		// expression, it multiplies a number by a different number^2
		int expo;

		do
		{
			System.out
					.print("Please enter a positive exponent (no decimals): ");
			expo = input.nextInt();

			if (expo < 0)
			{
				System.out.println("Error, exponent must be positive.");
			}

		} while (expo < 0);

		double result = 1;

		for (int loop = 0; loop < expo; loop++)
		{
			result = result * inputBase;
		}

		System.out.println("Base number is: " + inputBase);
		System.out.println("Exponent is: " + expo);
		System.out.println("Result is: " + result);

		input.close();
	}
}
