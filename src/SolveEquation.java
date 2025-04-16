
public class SolveEquation {
    public static void main(String[] args) {
        String equation = "x+5-3+x=6+x-2";
        System.out.println(solveEquation(equation));
    }
    public static String solveEquation(String equation) {
        String[] eqs = equation.split("=");
        System.out.println(eqs[0]);
        System.out.println(eqs[1]);
        int lx = 0;
        int rx = 0;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(int i = 0; i < eqs[0].length(); i++) {
            if(eqs[0].charAt(i) == 'x') {
                lx++;
            }
            else {
                if(!((i - 1) >= 0 && eqs[0].charAt(i - 1) == 'x') || !((i + 1) < eqs[0].length() && eqs[0].charAt(i) == 'x')) {
                    s1.append(eqs[0].charAt(i));
                }
            }
        }
        for(int i = 0; i < eqs[1].length(); i++) {
            if(eqs[1].charAt(i) == 'x') {
                rx++;
            }
            else {
                s2.append(eqs[1].charAt(i));
            }
        }
        System.out.println(lx);
        System.out.println(rx);
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        return null;
    }
}
