import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose difficulty: Easy, Medium, or Hard: ");
        String diff = scan.nextLine();
        int num = -1;

        boolean finish = false;

        for (int i = 0; i < 5; i++) {

            if (diff.equals("Easy")) {
                num = rand.nextInt(50);
                System.out.println("Guess a number between 0 and 50");
                break;
            }

            else if (diff.equals("Medium")) {
                num = rand.nextInt(100);
                System.out.println("Guess a number between 0 and 100");
                break;
            }

            else if (diff.equals("Hard")) {
                num = rand.nextInt(150);
                System.out.println("Guess a number between 0 and 150");
                break;
            }

            else {
                System.out.println("Please check your spelling and try again: ");
            }

            diff = scan.nextLine();
        }

        System.out.println("Enter guess 1: ");
        int guess = scan.nextInt();

        for (int i = 0; i < 6; i++) {
            if (guess == num) {
                System.out.println("Good job, " + String.valueOf(num) + " was the number. It took you " + String.valueOf(i + 1) + " guesses.");
                finish = true;
                break;
            }

            else {
                if (guess < num) {
                    System.out.println("Your guess was less than the chosen number");
                }
                 else if (guess > num) {
                    System.out.println("Your guess was greater than the chosen number");
                 }
            }

            System.out.println("Enter guess " + String.valueOf(i + 2) + ": ");
            guess = scan.nextInt();


        }

        if (finish == false) {
            System.out.println("You failed, the number was " + String.valueOf(num));
        }

    }
}