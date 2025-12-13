import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.printf("Number Guessing Game\nGuess a number between %d-%d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("TOO LOW! Try Again");
            } else if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try Again");
            } else {
                System.out.printf("CONGRATS! You guessed the number %d in %d attempts.\n", randomNumber, attempts);
            }

        } while (guess != randomNumber);

        scanner.close();
    }
}
