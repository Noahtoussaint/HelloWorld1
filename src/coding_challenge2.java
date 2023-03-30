import java.util.Scanner;

public class coding_challenge2  {
    public static void main (String [] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = scanner.nextLine();
        System.out.println("\n");

        System.out.print("Age: \n");
        int yearsLived = scanner.nextInt();
        System.out.println("\n");

        System.out.print("You have ");
        System.out.print(firstName. length());
        System.out.print(" characters in your name.\n\n");

        System.out.println("Your have lived " + yearsLived + "years. In another " + yearsLived + " you'll be " + (yearsLived+yearsLived) + ".");

    }
}