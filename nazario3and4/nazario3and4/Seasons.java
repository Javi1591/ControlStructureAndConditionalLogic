// Xavier Nazario
// Student ID# 2512208

package nazario3and4;

// Import Scanner utility
import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		// Start Scanner
		Scanner scanner = new Scanner(System.in);

		// Prompt for User Input
		// Declare month and day
		System.out.print("Enter a month (1 - 12): ");
		int month = scanner.nextInt();
		System.out.print("Enter a day (1 - 31): ");
		int day = scanner.nextInt();

		// Using conditional operands and if-else statements
		// Determine Season
		// Declare season String
		String season;
		if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day < 21)) {
			season = "Spring";
		} else if ((month == 6 && day >= 21) || (month > 6 && month < 9) || (month == 9 && day < 22)) {
			season = "Summer";
		} else if ((month == 9 && day >= 22) || (month > 9 && month < 12) || (month == 12 && day < 21)) {
			season = "Fall";
		} else {
			season = "Winter";
		}

		// Display season
		System.out.println("The computer outputs: " + season);

		// Close scanner
		scanner.close();
	}
}
