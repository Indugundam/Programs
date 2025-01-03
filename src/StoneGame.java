public class StoneGame {
    public boolean canAliceWin(int n) {
        if (n >= 10) {
            int alice = 10;
            n -= 10;
            if (n == 0) return true;
            while (n > 0) {
                int bob = alice - 1;
                if (bob > n) {
                    return true;
                }
                n -= bob;
                alice = bob - 1;
                if (alice > n) {
                    return false;
                }
                n -= alice;
                if (n == 0) return true;
            }
        }
        return false;
    }
}
