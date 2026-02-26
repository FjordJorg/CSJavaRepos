/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: Validates if number is positive    

 *    

 */
import java.util.Scanner;

public class GEMO3ValidateNumber
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int inputExpo = 0;

		do
		{
			System.out.print("Please enter a positive value number");
			inputExpo = input.nextInt();
			if (inputExpo <= 0)
			{
				System.out.println("/nerror not a valid exponent");
				System.out.println("try again please");
			}
		} while (inputExpo <= 0);
		// do while does not execute. Perhaps use sentinel value, while
		System.out.print("Your postivie exponent is " + inputExpo);
		System.out.print(" Please enter a base ");

		double inputBase = input.nextDouble();

		for (int expo = inputExpo; expo >= inputExpo; expo--)
		{
			System.out.print(inputBase * inputExpo * inputExpo);
			// TODO Auto-generated method stub
		}
		input.close();
	}
}
