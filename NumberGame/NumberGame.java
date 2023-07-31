import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Hello!! Welcome to the Number Game!");

        do {
            int target = random.nextInt(max - min + 1) + min;
            int totalattempts = 0;
            int guess;

            System.out.println("Please guess a number between"+" "+min +" "+"and"+" "+max);

            while (totalattempts < maxAttempts) {
                System.out.print("Enter the number you guessed: ");
                guess = scanner.nextInt();
                totalattempts++;

                if (guess == target) {
                    System.out.println("Congratulations!! You guessed the correct number in " + totalattempts + " attempts.");
                    score++;
                    break;
                } else if (guess < target) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (totalattempts >= maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + target + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        } while (true);

        System.out.println("Game over! Your score is " + score);
        scanner.close();
    }
}