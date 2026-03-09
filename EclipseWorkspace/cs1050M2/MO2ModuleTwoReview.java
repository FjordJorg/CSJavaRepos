/**
 * 
 */

/**
 * 
 */
public class MO2ModuleTwoReview
{
	public static void main(String[] args)
	{
		System.out.println("=== BOOLEAN / RELATIONAL OPERATORS ===");

		// Predict the results before
		// Prediction first; Result second

		System.out.println("1: " + (5 > 3 && 2 < 4));
		// Answer: True (5 is greater, AND 4 is greater)
		System.out.println("2: " + (true || false && false)); // 2. True
		// && first, || or second.
		System.out.println("3: " + (!(5 > 3))); // 3. False
		// NOT 5 is greater than 3.
		System.out.println("4: " + (3 + 4 > 5 && 10 != 8));
		// True 7: greater AND 10 is NOT 8

		System.out.println("\n=== SIMPLE IF / ELSE ===");

		int x = 7;

		if (x > 5)
			System.out.println("5: A"); // 5. A (x=7, 7 >5)
		else
			System.out.println("5: B");

		int y = 3;

		if (y > 5)
			System.out.println("6: A");
		else
			System.out.println("6: B"); // 6. B (y=3 < 5), C (C not part of the
										// if/else)

		System.out.println("6: C");

		System.out.println("\n=== MULTI-WAY IF ===");

		int score = 85;

		if (score >= 90)
			System.out.println("7: A");
		else if (score >= 80)
			System.out.println("7: B"); // 7. B (85>=80)
		else
			System.out.println("7: C");

		System.out.println("\n=== NESTED IF ===");

		int a = 10;
		int b = 4;

		if (a > 5)
		{
			if (b > 5)
				System.out.println("8: A");
			else
				System.out.println("8: B"); // 8. B. (a=10>5, b=4<5)
		}

		System.out.println("\n=== SWITCH STATEMENT ===");

		int day = 1;

		switch (day)
		{
			case 1 :
				System.out.println("9: Monday"); // 9. Monday (day=1,
													// switch=day, day/case=1)

				// Answer, switch keeps going until code breaks, will print
				// Monday && Tuesday, since break doesn't occur until Tuesday.
			case 2 :
				System.out.println("9: Tuesday");
				break;
			default :
				System.out.println("9: Other");
		}

		System.out.println("\n=== VARIABLE SCOPE ===");

		int value = 5;

		if (value == 5)
		{
			value = 10;
		}

		System.out.println("10: " + value);

		if (value == 10)
		{
			int newNumber = 20;
		}
		// 10. 10, newNumber was never initialized outside of loop. Not part of
		// scope.

		System.out.println("\n=== METHODS / PARAMETERS ===");

		int result = add(3, 4);
		System.out.println("11: " + result); // 11. 7. (add with 2 numbers adds
												// them)

		int m = 10;

		System.out.println("12: " + mystery(m)); // 12. NA? Cannot resolve to a
													// variable?
		// mystery is method below
		System.out.println("13: " + m); // 13. 10

		System.out.println("\n=== COMBINED FLOW QUESTION ===");

		int n = 6;

		if (n > 5)
		{
			System.out.println("14: A"); // 14. A. 5<6<10.

			if (n > 10)
				System.out.println("14: B");
		} else
		{
			System.out.println("14: C");
		}
	}

	public static int add(int a, int b)
	{
		return a + b;
	}

	public static int mystery(int x)
	{
		x = x + 5;
		return x;
	}
}