import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class coding_challenge3 {

    public static void main(String[] args) {
        game();
    }

    public static void game() {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        System.out.print("Welcome to the lucky shot game please guess a number between 1 - 5: ");
        int userGuess = scanner.nextInt();
        System.out.println();

        if (userGuess == randomNumber) {
            System.out.print("Correct! Arent you lucky?");
        } else {
            System.out.print("Not Quite it! Have another guess: ");
            int userGuess2 = scanner.nextInt();

            if (userGuess2 == randomNumber) {
                System.out.print("Hurray you got it!");
            } else {
                System.out.print("Better luck next time");
            }

            // (userGuess < randomNumber || userGuess > randomNumber)
        }


      /*  public static void first_challenge(String) {
            int x = 9;
            int y = 9;

            if (x > y)
                System.out.print("X is bigger than Y and the difference between them is " + (x - y));
            else if (x == y)
                System.out.print("X and Y are the same");
            else
                System.out.print("X is smaller than Y ad the difference between them is " + (y - x));
        }*/

    }
}