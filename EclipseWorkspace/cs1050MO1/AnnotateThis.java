/* 

 *  Name: Warren

 *  Class: CS1050 (T/TH) 

 *  Description: MODULE 1 Quiz practice     

 *    

 */
public class AnnotateThis
{

	public static void main(String[] args)
	{

		// ** Q1: Is this line declaring, initializing, or assigning? Explain.
		// A1: This line is declaring, initializing, AND assigning.
		// Declaration defines variable name and data type, tells compiler
		// what info variable is and allocates memory to reserve
		// Initializing assigns a variable its initial value
		// Assignment means storing a value into a variable using =.
		int apples = 7;

		// Q2: Why is double used instead of int?
		// A2: double is a Numeric Primitive data type, it is used for decimals
		// double can store more bytes than integer.
		// price is usually a decimal value
		double pricePerApple = 0.75;

		// Q3: Is TAX_PERCENT a constant or variable? List two reasons for how
		// you know.
		// Q3: TAX_PERCENT is a constant. 1. ALL CAPS 2. final stores data type
		// as constant
		// Constants will not/cannot change values throughout the program
		final int TAX_PERCENT = 8;

		// Q4: What value does totalApples have right now?
		// A4: 7. The program has initialized a new variable and stored the data
		// from the variable apples
		int totalApples = apples;

		// Q5: What value does totalApples have now?
		// A5: 10. totalApples was equal to the value of apples, which was 7.
		// uses Arithmetic addition operator to add 3 to value, which is now 10.
		totalApples = apples + 3;

		// Q6: What is the value of mathResult? Why? What order of operations is
		// being followed?
		// A6: 18. PEMDAS is being followed, parentheses, exponents,
		// multiplication/division,
		// addition/subtraction.
		int mathResult = 10 + 4 * 2;

		// Q7: What value is stored here? Why?
		// A7: 3. Since this is an integer division, no decimal value will be
		// stored.
		// it "truncates" the decimal value, or deletes it, and returns the
		// integer
		// with out the remainder or the decimal.
		int intDivision = 17 / 5;

		// Q8: Why is this NOT 3.4 even though the variable is double?
		// A8: The variable was declared as a variable, however, the numbers
		// are still integer values, and are treated as integer values.
		// You would need a decimal value to cast the integers (widen) into a
		// double.
		double stillIntDivision = 17 / 5;

		// Q9: What value is stored here? What changed compared to above?
		// A9: 3.4. Because there is a decimal value, Java will automatically
		// cast,
		// called implicit casting, into a double.
		double realDivision = 17 / 5.0;

		// Q10: What value will be assigned to remainder
		// A10: 2. The Modulo operator, %, returns the remainder of division.
		// 17 / 5 = 3.4. When doing long division, a remainder of 2 is left
		// over.
		// Modulo operator will produce the remainder.
		int remainder = 17 % 5;

		// Q11: What type is the result of this expression? Why?
		// A11: double, (variable) Numeric Primitive data type.
		// pricePerApple was stored as a decimal value (0.75), multiplying by an
		// integer variable totalApples (currently 10). This will widen the
		// integer
		// into a double automatically. Example of implicit casting (automatic)
		double subtotal = totalApples * pricePerApple;

		// Q12: What kind of casting is being done here? Will it round or
		// truncate?
		// A12: This is explicit (manual) casting. Since it is manually casting
		// into an
		// integer, it will truncate (remove) the decimal value and only store
		// the
		// integer value.
		int dollarsOnly = (int) subtotal;

		// Q13: What class is used for standard output? How can you tell (naming
		// conventions)?
		// A13: System: class. class names use uppercase first letter CamelCase,
		// out: field/object (default console) static member of the System
		// class.
		// Represents the standard output stream.
		// println()- method, camelCase starts with lowercase.
		System.out.println("totalApples = " + totalApples);

		// Q14: Before running, predict the outputs for all division-related
		// lines.
		// A14: intDivision = 3, stillIntDivision = 3.0, realDivision = 3.4.
		// realDivision is the only one implicitly casting into a double.
		System.out.println("intDivision = " + intDivision);
		System.out.println("stillIntDivision = " + stillIntDivision);
		System.out.println("realDivision = " + realDivision);

		// Q15: declare a variable called cuteDog and assign it the string value
		// Jalapena
		String cuteDog = "Jalepena";

		// Q16: Why is 100.0 used instead of 100?
		double taxRate = TAX_PERCENT / 100.0;

		// Q17: Break this expression into steps. What happens first? What value
		// is assigned to totalWithTax?
		double totalWithTax = subtotal + (subtotal * taxRate);

		// Q18: What data type is totalWithTax and why?
		System.out.println("totalWithTax = " + totalWithTax);
	}
}