
import java.util.Scanner;

public class BuildDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the diamond: ");
        int diamondWidth = scanner.nextInt();
        buildDiamond(diamondWidth);
    }

    private static void buildDiamond(int diamondWidth) {
        if (diamondWidth > 51) {
            System.out.println("Width is large");
        } else {
            char letter;
            int mid = diamondWidth / 2;
            for (int row = 0; row < mid + 1; row++) {
                System.out.print(" ".repeat(mid - row));
                for (int col = 0; col < (2 * row) + 1; col++) {
                    if (col > row) {
                        letter = (char) ('A' + (2 * row) - col);
                    } else {
                        letter = (char) ('A' + col);
                    }
                    System.out.print(letter);
                }
                System.out.println();
            }
            for (int row = mid - 1; row >= 0; row--) {
                System.out.print(" ".repeat(mid - row));
                for (int col = 0; col < (2 * row) + 1; col++) {
                    if (col > row) {
                        letter = (char) ('A' + (2 * row) - col);
                    } else {
                        letter = (char) ('A' + col);
                    }
                    System.out.print(letter);
                }
                System.out.println();
            }
        }
    }
}
