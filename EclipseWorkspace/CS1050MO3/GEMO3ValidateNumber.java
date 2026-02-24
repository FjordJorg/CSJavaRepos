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

		System.out.print("Please enter a positive value number");
		int number = input.nextInt();

		do
		{
			System.out.println("Error. Please enter positive number");
		} while (number < 0);
		// TODO Auto-generated method stub
		input.close();
	}

}
