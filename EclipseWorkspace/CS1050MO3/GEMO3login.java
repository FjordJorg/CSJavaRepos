/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: Mimics login username/password with 3 attempts

 *    

 */
import java.util.Scanner;

public class GEMO3login
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String username = "test";
		String password = "pass123";

		String inputUsername;
		String inputPassword;

		System.out.print("Please enter username: ");
		inputUsername = input.next();

		if (inputUsername.equals(username))
		{
			do
			{
				System.out.print("Please enter password: ");
				inputPassword = input.next();
			} while (!inputPassword.equals(password));

			System.out.println("Login successful!");
		} else
		{
			System.out.println("Invalid username.");
		}

		input.close();
	}
}
