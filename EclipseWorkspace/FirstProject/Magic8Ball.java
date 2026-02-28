public class Magic8Ball
{
	public static void main(String[] args)
	{
		// Get a random number from 1 to 8
		int random = (int) ((Math.random() * 8) + 1);
		// Use if statements to test the random number
		if (random == 1)
		{
			System.out.print("Don't make me sick!");
		}
		// and print out 1 of 8 random responses
		if (random == 2)
		{
			System.out.print("Very doubtful!");
		}
		if (random == 3)
		{
			System.out.print("Probably Not!");
		}
		if (random == 4)
		{
			System.out.print("Why are you asking me?!");
		}
		if (random == 5)
		{
			System.out.print("Please don't make me decide!");
		}
		if (random == 6)
		{
			System.out.print("Unequivocably no!");
		}
		if (random == 7)
		{
			System.out.print("Ask again later!");
		}

	}
}
