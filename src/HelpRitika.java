import java.util.*;

public class HelpRitika {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            substrings.add(sc.nextLine());
        }

        String mainString = sc.nextLine();

        int k = sc.nextInt();

        String bestFormed = "";
        Queue<State> q = new LinkedList<>();
        q.add(new State(0, "", k));

        while (!q.isEmpty()) {
            State current = q.poll();
            int idx = current.idx;
            String formed = current.formed;
            int deletionsLeft = current.deletionsLeft;

            if (idx == mainString.length()) {
                System.out.println("Possible");
                return;
            }

            if (deletionsLeft < 0) {
                continue;
            }

            if (formed.length() > bestFormed.length()) {
                bestFormed = formed;
            }

            for (String sub : substrings) {
                int deletionsNeeded = countDeletions(sub, mainString.substring(idx));

                if (deletionsNeeded <= deletionsLeft) {
                    StringBuilder newFormedTemp = new StringBuilder();
                    int i = 0, j = idx;

                    while (i < sub.length() && j < mainString.length()) {
                        if (sub.charAt(i) == mainString.charAt(j)) {
                            newFormedTemp.append(sub.charAt(i));
                            j++;
                        }
                        i++;
                    }

                    q.add(new State(idx + newFormedTemp.length(), formed + newFormedTemp, deletionsLeft - deletionsNeeded));
                }
            }
        }

        if (!bestFormed.isEmpty()) {
            System.out.println(bestFormed);
        } else {
            System.out.println("Nothing");
        }
    }

    private static int countDeletions(String s1, String s2) {
        int count = 0, i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            } else {
                count++;
            }
            i++;
        }

        count += s1.length() - i;
        return count;
    }

    static class State {
        int idx;
        String formed;
        int deletionsLeft;

        State(int idx, String formed, int deletionsLeft) {
            this.idx = idx;
            this.formed = formed;
            this.deletionsLeft = deletionsLeft;
        }
    }
}
