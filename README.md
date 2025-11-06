# COP2251 – Java Assignments 3 & 4

## Summary
These Java assignments practice decision-making and control flow using conditional logic, user input handling, randomization, and formatted console output. They strengthen skills in applying `if/else` chains, boundary conditions, and simple game logic.

## Program Behavior
- RandomIntDifference  
  - Generates two random integers between 25 and 75 (inclusive), displays both values, computes their difference, and prints the result.
- RockPaperScissors  
  - Prompts the user for a move (Rock, Paper, or Scissors), randomly selects a computer move, compares the choices, and reports win/lose/tie. Includes basic input normalization and closes the scanner on exit.
- Seasons  
  - Prompts for month and day, determines the season based on astronomical boundary dates, and prints the season. Logic follows:
    - Spring: (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day < 21)
    - Summer: (month == 6 && day >= 21) || (month > 6 && month < 9) || (month == 9 && day < 22)
    - Fall:   (month == 9 && day >= 22) || (month > 9 && month < 12) || (month == 12 && day < 21)
    - Winter: otherwise

## Key Concepts Demonstrated
- Conditional Logic: Chained `if/else` and compound Boolean expressions for date and game rules.
- Randomization: Using `java.util.Random` to generate integers and computer moves.
- User Input: Reading and validating console input with `java.util.Scanner`.
- Control Flow and Normalization: Branching on normalized user choices and handling invalid input paths.
- Console Output: Clear, structured status and results.

## How to Compile and Run
Requirements:
- Java Development Kit (JDK) 17 or later
- Command line terminal or IDE (IntelliJ IDEA, Eclipse, or VS Code)

Commands:
javac nazario3and4/nazario3and4/RandomIntDifference.java nazario3and4/nazario3and4/RockPaperScissors.java nazario3and4/nazario3and4/Seasons.java
java nazario3and4.RandomIntDifference
java nazario3and4.RockPaperScissors
java nazario3and4.Seasons
