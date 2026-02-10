/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class MathClass
{

	/**
	 * @param args
	 */
	public static void main(String[] args)

	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first name");
		String firstName = input.next();
		System.out.println("First name " + firstName);
		System.out.println("Enter the initial of your last name");
		char lastInitial = input.next().charAt(0);
		String summary = "Hello " + firstName + " " + lastInitial + ".";
		System.out.println(summary);
		input.close();

		// TODO Auto-generated method stub

	}

}
