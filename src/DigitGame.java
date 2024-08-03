import java.util.Scanner;

public class DigitGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        long number = input.nextLong();
        findSmallestAndLargest(number);
    }
    private static void findSmallestAndLargest(long number) {
        int remainder;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(number > 0) {
            remainder = (int) (number % 10);
            if(min > remainder) {
                min = remainder;
            }
            if(max < remainder) {
                max = remainder;
            }
            number = number / 10;
        }
        System.out.println("Smallest number:" + min);
        System.out.println("Largest number:" + max);
    }
}
