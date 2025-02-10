public class BullsAndCows {
    public static void main(String[] args) {
        String secret = "1807";
        String guess = "7810";
        System.out.println(getHint(secret, guess));
    }
    public static String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        StringBuilder str = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            }
            else {
                s1.append(secret.charAt(i));
                s2.append(guess.charAt(i));
                System.out.println(s2.length());
                for(int k = 0; k < s2.length(); k++) {
                    if(s1.toString().contains(guess.charAt(k) + "")) {
                        s1.deleteCharAt(s1.indexOf(guess.charAt(k) + ""));
                        s2.deleteCharAt(k);
                        cows--;
                    }
                }
            }
//            System.out.println(s1.toString() + " " + s2.toString());
            if(secret.contains(guess.charAt(i) + "") && secret.charAt(i) != guess.charAt(i)) {
                cows++;
            }
        }
        str.append(bulls + "A");
        str.append(cows + "B");
        return str.toString();
    }
}
