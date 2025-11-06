// Xavier Nazario
// Student ID# 2512208

package nazario3and4;

// Import Scanner and Random utilities
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		// Start the Scanner and Random
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// Prompt for User Input and Declare userChoice
		System.out.print("Pick one Rock: 0, Paper: 1, Scissors: 2 -> ");
		int userChoice = scanner.nextInt();

		// Generate computer's answer and Declare computerChoice
		int computerChoice = random.nextInt(3);

		// Display both answers
		System.out.println("You: " + userChoice);
		System.out.println("Computer: " + computerChoice);

		// Determine the winner using if-else statements and Display results
		if (userChoice == computerChoice) {
			System.out.println("It's a tie!");
		} else if ((userChoice == 00 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0)
				|| (userChoice == 2 && computerChoice == 1)) {
			System.out.println("You win!");
		} else {
			System.out.println("Computer Wins!");
		}

		// Close Scanner
		scanner.close();
	}
}
