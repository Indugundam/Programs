import java.util.Scanner;
public class FrequencyFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  frequency[] = new int[10];
        String text = input.next();
        int i;
        for (i = 0; i < text.length(); i++) {
              frequency[text.charAt(i)-'0']++;
        }
        for(i = 0 ; i < 10 ; i++) {
            System.out.println("Frequency of "+(char)i +" is" +frequency[i]);
        }
    }
}
