public class BusStops {
    public static void main(String[] args) {
        int[] distance = {1, 2, 3, 4};
        System.out.println(distanceBetweenBusStops(distance, 0, 2));
    }
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwiseDist = 0;
        int counterClockwiseDist = 0;
        for(int i = 0; i < destination; i++) {
            clockwiseDist += distance[i];
        }
        int min = start < destination ? start : destination;
        int max = start > destination ? start : destination;
        for(int j = 0; j <= distance.length + min - max; j++) {
            counterClockwiseDist += distance[(destination + j) % (distance.length + 1)];
        }
        return clockwiseDist < counterClockwiseDist ? clockwiseDist : counterClockwiseDist;
    }
}
