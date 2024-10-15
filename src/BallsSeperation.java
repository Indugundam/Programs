public class BallsSeperation {
    public static void main(String[] args) {
        String s = "10110";
        System.out.println(minimumSteps(s));
    }
    public static long minimumSteps(String s) {
        StringBuilder str = new StringBuilder();
        char[] charArray = s.toCharArray();
        long swapCount = 0;
        int countOf0 = 0;
        int countOf1 = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
                countOf0++;
            }
            else {
                countOf1++;
            }
        }
        for(int i = 0; i < countOf0; i++) {
            str.append('0');
        }
        for(int j = countOf0; j < s.length(); j++) {
            str.append('1');
        }
        int index = s.length() - countOf1;
        int k = 0;
        boolean allSet = true;
        while(allSet) {
            if(s.charAt(index) != '1') {
                if(s.charAt(k) == '1') {
                    swapCount = swapCount + index - k;
                    char temp = charArray[k];
                    charArray[k] = charArray[index];
                    charArray[index] = temp;
                    k++;
                }
            }
            else {
                index++;
            }
            if (String.valueOf(charArray).equals(str.toString())) {
                allSet = false;
            }
        }
        return swapCount;
    }
}
