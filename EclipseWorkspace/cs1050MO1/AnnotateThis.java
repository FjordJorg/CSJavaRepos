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
		// A4: 7. The program has initialized a new variable as an int and
		// stored
		// the data (assigned the value) from the variable apples.
		int totalApples = apples;

		// Q5: What value does totalApples have now?
		// A5: 10. totalApples was equal to the value of apples, which was 7.
		// uses Arithmetic addition operator to add 3 to value, which is now 10.
		totalApples = apples + 3;

		// Q6: What is the value of mathResult? Why? What order of operations is
		// being followed?
		// A6: 18. PEMDAS is being followed, parentheses, exponents,
		// multiplication/division, addition/subtraction.
		// Since there are no parentheses, multiplication happens first, then
		// addition. 4 * 2 = 8. 8 + 10 = 18.
		int mathResult = 10 + 4 * 2;

		// Q7: What value is stored here? Why?
		// A7: 3. Since this is an integer division, no decimal value will be
		// stored.
		// It "truncates" the decimal value, or deletes it, and returns the
		// integer without the remainder or the decimal.
		int intDivision = 17 / 5;

		// Q8: Why is this NOT 3.4 even though the variable is double?
		// A8: The variable was declared as a variable, however, the numbers
		// are still integer values, and are treated as integer values.
		// You would need a decimal value to cast the integers (widen) into a
		// double.
		double stillIntDivision = 17 / 5;

		// Q9: What value is stored here? What changed compared to above?
		// A9: 3.4. Because there is a decimal value, Java will automatically
		// cast,called implicit casting, into a double.
		double realDivision = 17 / 5.0;

		// Q10: What value will be assigned to remainder
		// A10: 2. The Modulo operator, %, returns the remainder of division.
		// 17 / 5 = 3.4. When doing long division, a remainder of 2 is left
		// over.
		// Modulo operator will produce the remainder rather than the decimal
		// value or integer value.
		int remainder = 17 % 5;

		// Q11: What type is the result of this expression? Why?
		// A11: double, (variable) Numeric Primitive data type.
		// pricePerApple was stored as a decimal value (0.75), multiplying by an
		// integer variable totalApples (currently 10). This will widen the
		// integer into a double automatically. Example of implicit casting.
		double subtotal = totalApples * pricePerApple;

		// Q12: What kind of casting is being done here? Will it round or
		// truncate?
		// A12: This is explicit (manual/narrowing) casting. Since it is
		// manually
		// casting into an integer, it will truncate (remove) the decimal value
		// and only store the integer value.
		int dollarsOnly = (int) subtotal;

		// Q13: What class is used for standard output? How can you tell (naming
		// conventions)?
		// A13: System: class. class names use uppercase first letter CamelCase,
		// out: field/object (default console) static member of the System
		// class.
		// println()- method, camelCase starts with lowercase.
		// Represents the standard output stream.
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
		// Strings need to be declared as a quotation "".
		String cuteDog = "Jalepena";

		// Q16: Why is 100.0 used instead of 100?
		// A16: To force floating-point division and get a precise decimal
		// result
		// Sales tax is 8%, and TAX_PERCENT was declared as a constant (final
		// int).
		// By implicitly casting, integer 8 is divided by 100.00 to give it a
		// decimal value, allowing the taxRate to hold 0.08 as the proper
		// floating point value.
		double taxRate = TAX_PERCENT / 100.0;

		// Q17: Break this expression into steps. What happens first? What value
		// is assigned to totalWithTax?
		// totalWithTax is first initialized as a variable as a literal double
		// to be able to hold a floating point decimal value.
		// Next, it is assigned the value of an arithmetic expression.
		// subtotal = totalApples * pricePerApple (calculated in previous line)
		// PEMDAS (subtotal (7.5) * taxRate (0.08) = 0.6) + subtotal (7.5) = 8.1
		// taxRate is applied to subtotal to find the taxes. It is then added to
		// the subtotal to produce the accurate totalWithTax.
		double totalWithTax = subtotal + (subtotal * taxRate);

		// Q18: What data type is totalWithTax and why?
		// A18: Primitive Numeric variable double
		// It stores the raw binary numerical value directly on the stack for
		// performance, rather than being an object reference on the heap.
		// Primitive types are reserved keywords built into the language and
		// are not objects. Variables use camelCase (lowercase first)
		System.out.println("totalWithTax = " + totalWithTax);
	}
}