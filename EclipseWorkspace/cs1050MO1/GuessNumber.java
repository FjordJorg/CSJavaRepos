
/**
 * This program takes user input to see if they can guess the 
 * random number generated. Add comments to explain the code.
 */

//Predefined Scanner Class
//Used to import the class 'scanner' for keyboard input
//Create an object from that class
import java.util.Scanner;

//Class name starts with capital letter and follows CamelCase
public class GuessNumber
{
	// Main method
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// Declaring and assigning a constant
		final int RANDOM_MULTIPLIER = 100;

		// Declaring a variable and assigning an equation applied to user input
		// Type identifier assignment literal
		// Math.random() is a method
		int number = (int) (Math.random() * RANDOM_MULTIPLIER) + 1;

		// This argument system.in means scan input from keyboards
		Scanner UserInput = new Scanner(System.in);

		// Method
		System.out.println("Guess a magic number between 0 and 100");

		// Statement declaring identifier 'guess' and integer assignment
		int guess = -1;
		// Statement declaring identifier 'number' with Boolean assignment
		while (guess != number)
		{

			// Method with string literal
			// Standard output with System class
			// Use object to call Scanner class methods to input next int
			// nextInt returns value, assign value to guess variable
			System.out.print("\nEnter your guess: ");
			guess = UserInput.nextInt();

			// Boolean primitive data type non numeric
			if (guess == number)
			{
				// String is a non primitive data type
				System.out.println("Yes, the number is " + number);
				input.close();
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
