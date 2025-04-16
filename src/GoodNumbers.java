public class GoodNumbers {
    public static void main(String[] args) {
        long n = 4;
        System.out.println(countGoodNumbers(n));
    }

    public static int countGoodNumbers(long n) {
        StringBuilder s = new StringBuilder();
        s.append("1");
        while (s.length() < n) {
            s.append("0");
        }

        long l = Long.parseLong(s.toString());
        long r = (l * 10) - 1;
        int count = 0;

        for (long i = l; i <= r; i++) {
            String str = i + "";
            boolean flag = true;

            for (int j = 0; j < str.length(); j++) {
                int digit = str.charAt(j) - '0';
                if (j % 2 == 0) {
                    if (digit % 2 != 0) {
                        flag = false;
                        break;
                    }
                } else {
                    if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                count++;
            }
        }

        return count;
    }
}
