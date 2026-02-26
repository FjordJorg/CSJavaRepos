/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: Mimics login username/password with 4 attempts

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
		
		String inputUsername = "0";
		String inputPassword = "1";
		
		System.out.print("Please enter username: ");
		inputUsername = input.next();
		
		do (input.equals(username));
		{
			System.out.print("Please enter password: ");
			inputPassword = input.next();
		}whle (input.equals(password))

	}

}
