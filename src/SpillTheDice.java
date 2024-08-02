import java.util.Random;

public class SpillTheDice {
    public static void main(String[] args) {
    int[] values = shuffleDice();
        System.out.println("The values on the dice are: ");
    for(int value : values) {
        System.out.print(value + "\t");
    }
    System.out.println();
    if(isHomogenous(values)) {
        System.out.println("The numbers on the dice are homogenous");
    }else {
        System.out.println("The numbers on the dice are not homogenous");
    }

    int[] frequencies = occurences(values);
    System.out.println("Frequencies of numbers on the dice are ");
    for(int i = 1; i < frequencies.length; i++) {
        System.out.print(frequencies[i] + "\t");
    }
    System.out.println();

    printDiceValues(frequencies);

    if(isFullHouse(frequencies)) {
        System.out.println("Three dice have same value and two other dice have same different value");
    }
    else {
        System.out.println("Three dice don't have same value or two other dice don't  have same different value");
    }
    }

    public static int[] shuffleDice() {
        int[] array = new int[5];
        Random random = new Random();
        for(int i = 0; i < 5; i++) {
           array[i] = random.nextInt(1,7);
        }
        return array;
    }

    private static boolean isHomogenous(int[] values) {
        for(int i = 0; i < values.length; i++) {
            if(values[i] != values[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] occurences(int[] values) {
        int[] frequencies = new int[7];
        for(int i = 0; i < values.length; i++) {
            frequencies[values[i]]++;
        }
        return frequencies;
    }

    public static void printDiceValues(int[] frequencies) {
        String[] array = new String[7];
        array[1] = "\u2680";
        array[2] = "\u2681";
        array[3] = "\u2682";
        array[4] = "\u2683";
        array[5] = "\u2684";
        array[6] = "\u2685";
        System.out.println("Dice numbers are c");
        for (int i = 1; i < frequencies.length; i++) {
            if (frequencies[i] == 1) {
                System.out.print(array[i] + "\t");
            }
            if (frequencies[i] > 1) {
                System.out.print(frequencies[i] + "x" + array[i] + "\t");
            }
        }
        System.out.println();
    }

    public static boolean isFullHouse(int[] frequencies) {
        int count1 = 0;
        int count2 = 0;
        for(int i = 1; i < frequencies.length; i++) {
            if(frequencies[i] == 3) {
                count1++;
            }
            if(frequencies[i] == 2) {
                count2++;
            }
        }
        return count1 == 1 && count2 == 1;
    }
}
