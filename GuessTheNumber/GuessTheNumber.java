package GuessTheNumber;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10);
        for (int i = 1; i <= 3; i++) {
            int numberUser = in.nextInt();
            if (numberUser == randomNumber) {
                System.out.println("You are the ---WINNER---");
                return;
            }
            if (numberUser > randomNumber) {
                System.out.println(numberUser + " too big ");
            }
            if (numberUser < randomNumber) {
                System.out.println(numberUser + " too small ");
            }
        }
        System.out.println("computer guessed the number " + randomNumber);
        System.out.println("Try again next time");
    }
}

