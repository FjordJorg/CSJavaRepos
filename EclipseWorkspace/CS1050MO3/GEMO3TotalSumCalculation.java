/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: Asks user for a positive integer, validates if number is positive, 
 *  then adds every number from 0 - integer the user entered, and returns total sum
 *  to main to be displayed.

 *    

 */
import java.util.Scanner;

public class GEMO3TotalSumCalculation
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
				System.out.println(" Error, not a valid number ");
				System.out.println(" Try again please ");
			}
		} while (inputNum <= 0);

		System.out.print("Your postivie number is " + inputNum + ".\n");

		int totalSum = calculateSum(inputNum);

		System.out.print("Total sum is: " + totalSum);

		input.close();

	}

	// End of main, sends to calculateSum

	public static int calculateSum(int inputNum)
	{
		int totalSum = 0;

		for (int count = 1; count <= inputNum; count++)
		{
			totalSum = totalSum + count;
		}

		return totalSum;

	}

}
