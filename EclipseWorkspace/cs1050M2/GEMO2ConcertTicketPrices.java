/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: Calculates     

 *    

 */
import java.util.Scanner;

public class GEMO2ConcertTicketPrices
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		// assigns variable f as character f
		char f = 'f';
		// converts character f to uppercase F
		char upperF = Character.toUpperCase(f);
		char c = 'c';
		char upperC = Character.toUpperCase(c);
		char s = 's';
		char upperS = Character.toUpperCase(s);
		char u = 'u';
		char upperU = Character.toUpperCase(u);

		System.out.println("Enter ONE character for section - ");
		System.out.println("F: Front  C: Center  S: Side  U: Upper ");
		char section = Character.toUpperCase(input.next().charAt(0));

		if (section == upperF)
		{
			System.out.print("You entered Front section.");
		} else if (section == upperC)
		{
			System.out.print("You entered Center section.");
		} else if (section == upperS)
		{
			System.out.print("You entered Side section.");
		} else if (section == upperU)
		{
			System.out.print("You entered Upper section.");
		} else
		{
			System.out.print("Invalid selection. Terminating program.");
		}

		System.out.print(" Enter row between 1 - 60");
		int row = input.nextInt();

		if (row >= 1 && row <= 60)
		{
			System.out.println("Valid input: " + row);
		} else
		{
			System.out.print("Invalid row. Program terminating.");
		}
		// Closes input
		input.close();
	}

}
