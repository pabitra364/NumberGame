import java.util.Scanner;
import java.util.Random;

public class T1_number_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a number between " + minRange + " and " + maxRange + ". Try to guess it!");

        int guess;
        int numberOfGuesses = 0;

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess < generatedNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > generatedNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + generatedNumber + " correctly!");
                System.out.println("It took you " + numberOfGuesses + " guesses.");
            }
        } while (guess != generatedNumber);

        scanner.close();
    }
}
