import java.util.List;

public class MaximumDistance {
    public static void main(String[] args) {
        List<List<Integer>> arrays = List.of(
                List.of(1, 5),
                List.of(3, 4)
        );
        System.out.println(maxDistance(arrays));
    }
    public static int maxDistance(List<List<Integer>> arrays) {
        int maxDistance = Integer.MIN_VALUE;
        int Currentdistance = 0;
        int n = arrays.size();
        System.out.println(n);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j != i) {
                    int k = arrays.get(j).size() - 1;
                    Currentdistance = Math.abs(arrays.get(j).get(k) - arrays.get(i).get(0));
                    if (Currentdistance > maxDistance) {
                        maxDistance = Currentdistance;
                    }
                }
            }
        }
        return maxDistance;
    }
}
