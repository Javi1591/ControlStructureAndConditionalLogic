// Xavier Nazario
// Student ID# 2512208

package nazario3and4;

// Import Random utility
import java.util.Random;

public class RandomIntDifference {

	public static void main(String[] args) {
		// Start Random utility
		Random random = new Random();

		// Generate 2 random integers between 25 to 75, inclusive
		// and Declare num1 and num2
		int num1 = 25 + random.nextInt(51);
		int num2 = 25 + random.nextInt(51);

		// Display both numbers
		System.out.println("First random integer: " + num1);
		System.out.println("Second random integer: " + num2);

		// Declare difference and calculate using if-else statement
		int difference;
		if (num1 > num2) {
			difference = num1 - num2;
		} else {
			difference = num2 - num1;
		}

		// Display difference
		System.out.println("Positive difference between the two integers: " + difference);
	}

}
