
//Eric Hackett

// I want to make a program that will convert measurements from metric to standard
//Java built in data types 
//	• Byte
//		○ 8-bit
//		○ Two complement integer 
//		○ Min value -128 Max 127
//		○ Can save data in large arrays
//		○ Can be used in place of int
//	• Short
//		○ 16-bit
//		○ Two complement integer
//		○ Min value -32,768 Max 32,767
//		○ Can save memory in large arrays
//	• Int
//		○ 32-bit
//		○ Two complement integer
//		○ Min value -2^31 Max 2^31-1
//		○ Can represent 32-bit unassigned integer (0-2^32-1)
//	• Long
//		○ 64-bit
//		○ Two complement integer
//		○ Min -2^63 max 2^63-1
//		○ Can rep 64-bit unassigned integer (0-2^64-1)
//		○ Used when need wider rang then int
//	• Float
//		○ Single-precision 32-bit IEEE 754
//		○ Large range
//		○ Use float instead of double to save memory for large point number of floating point numbers
//		○ Not used for precise values  (currency)
//	• Double
//		○ 64-bit IEEE 754 
//		○ Large range
//		○ Good for decimal values
//		○ Not used for precise values (currency) 
//	• Boolean
//		○ Two positive values
//			§ True
//			§ false
//		○ Flags to track true/false
//		○ Size not defined 
//			§ One bit of information
//	• Char
//		○ Single 16-bit Unicode
//			§ Min '\u0000' (or 0) Max'\uffff' (or 65,535 inclusive)
// static means belonging to the class, not a particular object
// methods in driver classes must be ststic because no objects of the class
// are created
// A variable is a piece of memory that can contain a data value.
// Scope is where the variable is accessible
import java.util.Scanner;
import java.util.Random;

// This is the Main class for my conversion calculator to convert a length to another length
public class ConversionCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // using scanner to get values and units from user

// a quick show of arrays inspired by https://www.udemy.com/course/java-tutorial/learn/lecture/137076#overview
//		int[] numbers = {10, 20, 30};
//		
//		System.out.println(numbers[2]);
//		
//		int[][] list = {
//				{10, 20, 30},
//				{24,},
//				{30, 70, 100, 500}
//		};
//		
//		System.out.println(list [1][1]);
//		System.out.println(list [0][2]);
//		
//		String[][] texts = new String [3][2];
//	
//		texts[0][1] = "array example";
//		
//		System.out.println(texts[0][1]);
//		
//		for(int row = 0; row < list.length; row++) {
//			for(int col = 0 ; col < list[row].length; col++) {
//				System.out.println(list[row][col] + "\t");
//			}
//			System.out.println();
//		}
//		
//		String[][] w = new String[2][];
//		
//		System.out.println(w[0]);
//		
//		w[0] = new String[3];
//		
//		w[0][1] = "in depth look at array and loop";
//		
//		System.out.println(w[0][1]);
		
		// nice friendly greeting
		System.out.println("Welcome to conversions made easy");
		System.out.println("Please follow the \'instructions\' carefully"); // put the escape sequence here to show case
																			// it

		System.out.print("Convert from unit: ");
		String fromUnit = scanner.nextLine();// getting you starting unit

		System.out.print("Convert to unit: ");
		String toUnit = scanner.nextLine();// getting what unit you would like to convert to

		// pulling info from the lenghtConverter class
		LenghtConverter from = new LenghtConverter(fromUnit);
		LenghtConverter to = new LenghtConverter(toUnit);

		System.out.print("Value = ");
		double val = scanner.nextDouble();

		double millimeters = from.toUnit(val);
		double converted = to.fromUnit(millimeters);
		
		Random random = new Random(); // use of random class

		

		System.out.println(val + fromUnit + " " + "= " + Math.round(converted * 100.0)/100.0 + toUnit); // use of math class and rounding 
	
		System.out.println("Here is a \"fun\" random number to try to conver next  " +  random.nextInt(50000));
		
		scanner.close();

	}

}
