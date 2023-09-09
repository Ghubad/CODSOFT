import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) 
    {
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int guess = scanner.nextInt();

        while (guess != number) {
            if (guess < number) {
                System.out.println("Your guess is too low number.");
            } else {
                System.out.println("Your guess is too high number.");
            }

            System.out.println("Enter your number:");
            guess = scanner.nextInt();
        }

        System.out.println("Congratulations! You guessed the correct number.");
    }
}
