/* 

 *  Name: Warren Hirschfeld

 *  Class: CS1050 (T/TH) 

 *  Description: MOD4 PassArraysLab, describe how the arrays are functioning as comments in each section.

 *    

 */
public class M04PassArraysLab
{

	public static void main(String[] args)
	{

		// Part 1: explore assigning one array to another
		System.out.println(
				"-------- Part 1 Assign an array to another array ---------");
		// explain what is happening

		// Declare and initialize array1 with values (stored in heap)
		// Declare array2 and allocate space for 4 integers (default values = 0)
		System.out.println("Declare and initialize array1 and array2");
		int[] array1 =
		{10, 2, 45, 12};
		int[] array2 = new int[4];

		// Print reference addresses (not actual contents)
		System.out.println("reference variable array1 " + array1);
		System.out.println("reference variable array2 " + array2);

		// Assign values to specific indexes in array2
		array2[0] = 1;
		array2[1] = 112;
		array2[2] = 82;

		// Display contents of both arrays
		System.out.println("Display array1\n");
		displayArray(array1);
		System.out.println("Display array2\n");
		displayArray(array2);

		// Assign array1 to array2
		// Now BOTH variables reference the SAME array in memory (array1's data)
		array2 = array1;

		// Both references now point to the same heap location
		System.out.println("\narray2 = array1;");
		System.out.println("reference variable array1 " + array1);
		System.out.println("reference variable array2 " + array2);

		// Display arrays (they now show identical data)
		System.out.println("Display array1");
		displayArray(array1);
		System.out.println("Display array2\n");
		displayArray(array2);

		// Modify elements through both references
		// Since they point to the same array, changes affect BOTH
		array1[1] = 9000;
		array2[3] = 1000;

		// Both outputs reflect the same modified array
		System.out.println("Display array1\n");
		displayArray(array1);
		System.out.println("Display array2\n");
		displayArray(array2);

		// Summarize part 1
		// Assigning one array to another copies the reference, NOT the data

		// Part 2 Copy Array 1 one element at a time into arrayCopy
		System.out.println("-------- Part 2 Copy with For Loop ---------");

		// Create a NEW array in memory (separate from array1)
		int[] arrayCopy = new int[4];

		// Show references (different memory locations)
		System.out.println("\nreference variable array1 " + array1);
		System.out.println("reference variable arrayCopy " + arrayCopy);

		// Display contents before copying
		System.out.println("Display array1\n");
		displayArray(array1);
		System.out.println("Display arrayCopy\n");
		displayArray(arrayCopy);

		// Copy each element individually using a loop
		// This creates a TRUE copy (different memory, same values)
		for (int i = 0; i < array1.length; i++)
		{
			arrayCopy[i] = array1[i];
		}

		// Modify both arrays independently
		array1[1] = -400;
		arrayCopy[3] = -999;

		// Displays memory address/reference variable for array1 and arrayCopy
		System.out.println("\nreference variable array1 " + array1);
		System.out.println("reference variable arrayCopy " + arrayCopy);

		// Changes do NOT affect each other (separate arrays)
		// Displays full current contents of both arrays (with different values
		// currently)
		System.out.println("Display array1\n");
		displayArray(array1);
		System.out.println("Display arrayCopy\n");
		displayArray(arrayCopy);

		// Summarize part 2
		// Copying with a loop creates a new independent array

		// Part 3 Passing array3 into updatePassedArray Method
		System.out.println("-------- Part 3 Pass Arrays---------");

		// Declare and initialize array3
		int[] array3 =
		{100, 200, 300, 400};

		// Displays array3 memory address/reference variable
		System.out.println("\nreference variable array3 " + array3);

		// Prints 'Display array3', passes to displayArray method
		// The reference is copied, but still points to SAME array in memory
		// Notes on what happens in displayArray method in method itself
		System.out.println("Display array3\n");
		displayArray(array3);

		// Passes array3 to a different method, updatePassedArray
		// The reference is copied, but still points to SAME array in memory
		// Notes on updatePassedArray in its own method
		updatePassedArray(array3);

		// Passes array3 back to displayArray method, now updated from
		// updatePassedArray method
		System.out.println("Display array3\n");
		displayArray(array3);

		// summarize Part 3
		// Arrays are passed by value of the reference, and methods can modify
		// original array

		// Part 4 Returning arrays from a method
		System.out
				.println("-------- Part 4 Return Arrays from method---------");

		System.out.println("call createArray method\n");

		// Call method that creates and returns a new array
		// Specifies array's length will be 5, index 0-4
		int[] array4 = createArray(5);

		// array4 now references the newly created array in heap memory
		System.out.println("after createArray method");
		System.out.println("reference variable array4 " + array4);
		System.out.println("Display array4\n");
		displayArray(array4);

	}// end main

	/*
	 * updatePassedArray calls passedArray[], adds 100 to each index location,
	 * and returns to main with updated values. Changes to arrays WILL affect
	 * original values.
	 */
	public static void updatePassedArray(int passedArray[])
	{
		// New stack frame is created, but passedArray references SAME heap
		// array
		System.out.println("\n** STACK updatePassedArray method start **");
		System.out.println("passedArray " + passedArray);

		// Loop through array and modify each element
		// Changes affect the original array
		// Uses for loop to start at index 0, adds 100 to each index's value,
		// and increments
		// to next index. Essentially adding 100 to each value individually for
		// each index.
		for (int i = 0; i < passedArray.length; i++)
		{

			passedArray[i] = passedArray[i] + 100;
		}

		// Notice you can call a method from within this method to display
		// passedArray
		displayArray(passedArray);
		System.out.println("** STACK updatePassedArray method end**\n");

	}

	/*
	 * createArray calls passed main arraySize (parameter determined in main as
	 * 5), creates new array, adds random int values 1-10 for each index to
	 * store, then passes newly created array back to main.
	 */
	public static int[] createArray(int arraySize)
	{
		System.out.println("\n** STACK createArray method start** ");

		// Create a new array in heap with given size
		int[] newArray = new int[arraySize];
		System.out.println("createArray " + newArray);

		// Fill array with random values from 1–10
		// array4 was passed with a length of 5, so indexes 0-4 will be filled
		// with these values.
		for (int i = 0; i < newArray.length; i++)
		{

			newArray[i] = (int) (Math.random() * 10 + 1);
		}
		System.out.println("** STACK createArray method end ** \n");

		// Return reference to the new array
		return newArray;
	}

	/*
	 * displayArray will display passedArray, uses for loop to print and display
	 * reference variable, each individual index location and its current stored
	 * value on a new line. As well as title of method start and end.
	 */
	public static void displayArray(int passedArray[])
	{

		// Method receives reference to array and displays contents
		System.out.println("\n** STACK displayArray method start** ");
		System.out.println("passedArray " + passedArray);

		// Uses for loop to start at index 0, and print each value until
		// all indexes are printed individually in a new line.
		for (int i = 0; i < passedArray.length; i++)
		{

			System.out.printf("array[%d] = %d \n", i, passedArray[i]);
		}
		System.out.println("** STACK displayArray method end** \n");
	}

}// end of class