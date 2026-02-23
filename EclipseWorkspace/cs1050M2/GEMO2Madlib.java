/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: Generates (single) Madlib from user input     

 *    

 */

import java.util.Scanner;

public class GEMO2Madlib
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a first name ");
		String firstName = input.next();
		System.out.print("Enter a last name ");
		String lastName = input.next();
		char firstLetter = lastName.charAt(0);

		System.out.print("Enter a noun ");
		String noun = input.next();
		System.out.print("Enter a verb ending in -ing ");
		String verb = input.next();

		System.out.print("Enter an adjective ");
		String adjective = input.next();

		System.out.print("Enter a place ");
		String place = input.next();
		System.out.print("Enter your favorite letter ");
		String letter = input.next();

		System.out
				.println("Once upon a time, " + firstName + " " + firstLetter);
		System.out.println(" was " + verb + " through the " + place);
		System.out.println(" with a " + noun + ". It was a very " + adjective);
		System.out.println(" day. Their favorite letter was " + letter + ".");

		input.close();
	}

}
