
/**
 * This program takes user input to see if they can guess the 
 * random number generated. Add comments to explain the code.
 */

import java.util.Scanner;

//Class name starts with capital letter and follows CamelCase
public class GuessNumber
{
	// Main method
	public static void main(String[] args)
	{
		// Declaring and assigning a constant
		final int RANDOM_MULTIPLIER = 100;

		// Declaring a variable and assigning an equation applied to user input
		// Type identifier assignment literal
		int number = (int) (Math.random() * RANDOM_MULTIPLIER) + 1;

		Scanner keyboardInput = new Scanner(System.in);
		// Method
		System.out.println("Guess a magic number between 0 and 100");

		// Statement declaring identifier 'guess' and integer assignment
		int guess = -1;
		// Statement declaring identifier 'number' with Boolean assignment
		while (guess != number)
		{

			// Method with string literal
			// Standard output with System class
			System.out.print("\nEnter your guess: ");
			guess = keyboardInput.nextInt();

			// Boolean primitive data type non numeric
			if (guess == number)
			{
				// String is a non primitive data type
				System.out.println("Yes, the number is " + number);
			} else if (guess > number)
			{
				System.out.println("Your guess is too high");
			} else
			{
				System.out.println("Your guess is too low");
			}
		}

	}// end of main
}// end of class
