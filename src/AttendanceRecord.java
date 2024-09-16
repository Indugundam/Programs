public class AttendanceRecord {
    public static void main(String[] args) {
        String record = "PPALLL";
        System.out.println(checkRecord(record));
    }

    public static boolean checkRecord(String s) {
        int countOfA = 0;
        int countOfL = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'A': {
                    countOfL = 0;
                    countOfA++;
                    if (countOfA >= 2) {
                        return false;
                    }
                    break;
                }
                case 'L': {
                    countOfL++;
                    if (countOfL >= 3) {
                        return false;
                    }
                    break;
                }
                default: {
                    countOfL = 0;
                    break;
                }
            }
        }
        return true;
    }
}
