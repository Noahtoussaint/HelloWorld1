import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class coding_challenge4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int i = 0;

        do  {
            System.out.print("Guess a number between 1 - 100: ");
            guess = scanner.nextInt();
            i++;

            if (guess < randomNumber) {
                System.out.println("Higher");
            }
            else if (guess > randomNumber) {
                System.out.println("Lower");
            }
            else System.out.println("CORRECT, my number was " + randomNumber + ".");

        }  while (guess != randomNumber);
        System.out.println ("It took you " + i + " to guess correctly.");

    }
}
   /* public static void fourth(String[] args){
        for (int i = 1; i <= 10; i++){
            System.out.print(i + ", ");
        }
        System.out.print("\b\b.");
    }
}
    public static void third(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Please enter the password:");
            password = scanner.nextLine();
        } while (!password.equals("shark50"));

        System.out.println("ACCESS APPROVED");
    }

}


    public static void second (String[] args) {

        for (int i = 1; i <= 40; i++) {
            System.out.println(i);

            if ((i % 3) == 0) {
                System.out.println("Quack");
            }


        }
    public static void first(String[] args){
        int i = 89;

        while (i <= 117){
            System.out.println(i);
            i++;
        }
    }*/


