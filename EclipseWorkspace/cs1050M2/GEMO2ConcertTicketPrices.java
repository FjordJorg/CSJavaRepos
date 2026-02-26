/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: Requests section and row for "concert", displays price for appropriate 
 *  row and section  
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
		// this allows user to input lower or upper case letters
		char upperF = Character.toUpperCase(f);
		char c = 'c';
		char upperC = Character.toUpperCase(c);
		char s = 's';
		char upperS = Character.toUpperCase(s);
		char u = 'u';
		char upperU = Character.toUpperCase(u);

		double cost = 0;

		// Asks user to input section
		System.out.println("Enter ONE character for section - ");
		System.out.println("F: Front  C: Center  S: Side  U: Upper ");
		char section = Character.toUpperCase(input.next().charAt(0));

		// if statements test which character is inputed, closes
		// program if it isn't F, C, S, or U.

		// Try to change to while loop, so it repeats if wrong
		// character is used, same for row
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
			System.out.print("Invalid selection. Please try again.");
		}

		// Outputs message prompting user to input integer
		// creates variable assigned to next integer input
		System.out.print(" Enter row between 1 - 60");
		int row = input.nextInt();

		// if else if statements to determine which row and price
		// first if tests row 1-15, second else if tests row 16-30,
		// Third else if tests row 31-60, then displays selected row price
		if (row >= 1 && row <= 15)
		{
			cost = 450.00;
			System.out.println("You entered section: " + section + " row " + row
					+ " The cost is $" + cost);
		} else if (row >= 16 && row <= 30)
		{
			cost = 300.00;
			System.out.println("You entered section: " + section + " row " + row
					+ " The cost is $" + cost);
		} else if (row >= 31 && row <= 60)
		{
			cost = 200.00;
			System.out.println("You entered section: " + section + " row " + row
					+ " The cost is $" + cost);
		} else
		{
			System.out.print("Invalid row. Program terminating.");
		}

		// Closes input
		input.close();
	}

}
