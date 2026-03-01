/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: Mimics login username/password with 3 attempts,
 *  locks after 3, breaks if successful early.

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

		boolean loginSuccess = false;

		for (int loop = 0; loop < 3; loop++)
		{

			System.out.print("Loop number: " + loop + ". ");

			System.out.print("Please enter username: ");
			inputUsername = input.next();

			if (inputUsername.equals(username))
			{
				System.out.print("Please enter password: ");
				inputPassword = input.next();

				if (inputPassword.equals(password))
				{
					loginSuccess = true;
					System.out.print("Login Successful! ");
					break;
				} else
				{
					System.out.print("Incorrect Password. ");
				}

			} else
			{
				System.out.print("Incorrect Username. ");
			}

		}
		if (!loginSuccess)
		{
			System.out.println("Account locked. ");

		}

		input.close();
	}
}
