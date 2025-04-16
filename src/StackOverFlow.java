import java.util.HashSet;
import java.util.Set;

public class StackOverFlow {
    public static void main(String[] args) {
        System.out.println(fact(1000));  // Changed from 10 to 1000

        System.out.println(6 / 4);
        System.out.println();


    }

    public static int fact(int n) {
        String s = "20th Oct 2052";
        String[] strings = s.split(" ");
        Set<String> months = Set.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        Set<String> dates = Set.of("1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th",
                "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th",
                "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th",
                "31st");
        int[] a = new int[1000];
        return n * fact(n - 1);
    }
}