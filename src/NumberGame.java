import java.util.Scanner;
import java.util.Random;

import static java.lang.System.exit;

public class NumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isCorrect;
        boolean isOk = true;
        int count = 0;
        do {
            System.out.println("1.Play\n2.Quit\n");
            System.out.println("Enter your choice:");
            int choice = input.nextInt();
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;
            switch (choice) {
                case 1: {
                    isCorrect = true; // Reset isCorrect flag
                    while (isCorrect) {
                        System.out.println("Guess the number? ");
                        int number = input.nextInt();
                        if (number == randomNumber) {
                            System.out.println("Correct guess!!!");
                            isCorrect = false;
                            break;
                        } else if ((number  == randomNumber - 5) || (number == randomNumber + 5)){
                            System.out.println("You are almost there ");
                        }
                        else if (number  < randomNumber ) {
                            System.out.println("Too low");
                        }
                        else if (number  > randomNumber ) {
                            System.out.println("Too high");
                        }
                        else{
                            System.out.println("Try again");
                        }
                        count = count + 1;
                        if (count > 10) {
                            System.out.println("Too many attempts");
                            break;
                        }
                    }
                    if (count == 1) {
                        System.out.println("Well done!!!\nYour score:10");
                    } else if (count == 2) {
                        System.out.println("Your score:9");
                    } else if (count == 3) {
                        System.out.println("Your score:8");
                    } else if (count == 4) {
                        System.out.println("Your score:6");
                    } else if (count == 5) {
                        System.out.println("Your score:5");
                    }
                    else {
                        System.out.println("Better luck next time");
                    }
                    break;
                }
                case 2:{
                    isOk = false;
                    exit(0);
                }
            }
        } while(isOk);
    }
}
