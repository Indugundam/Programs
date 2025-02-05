import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class IncreasingSequence {
    static final int BIT_NUM = 60;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int tc = 0; tc < t; ++tc) {
            long n = input.nextLong();
            System.out.println(solve(n));
        }
        input.close();
    }
    static String solve(long n) {
        List<Long> list = new ArrayList<>();
        list.add(n);
        int[] arr = IntStream.range(0, BIT_NUM).filter(i -> ((n >> i) & 1) == 1).toArray();
        if (arr.length >= 2) {
            for (int oneBit : arr) {
                list.add(n ^ (1L << oneBit));
            }
        }
        Collections.reverse(list);
        return "%d\n%s"
                .formatted(
                        list.size(),
                        list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}