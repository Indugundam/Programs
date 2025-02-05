//import java.util.Scanner;
//
//public class BasilsGarden {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            int length = sc.nextInt();
//            int sum = 0;
//            int seconds = 0;
//            int[] array = new int[length];
//
//            for (int p = 0; p < length; p++) {
//                array[p] = sc.nextInt();
//                sum += array[p];
//            }
//            if (length == 1) {
//                System.out.println(array[0]);
//            } else {
//                while (sum > 0) {
//                    for (int k = 0; k < length - 1; k++) {
//                        if (array[k] > array[k + 1]) {
//                            array[k] -= 1;
//                            sum = sum - 1;
//                        }
//                    }
//                    if (array[length - 1] > 0) {
//                        array[length - 1]--;
//                        sum -= 1;
//
//                    }
//                    seconds++;
//                }
//                System.out.println(seconds);
//            }
//        }
//        sc.close();
//    }
//}
//
////
////public class BasilsGarden {
////    public static void main(String[] args) {
//////        Scanner sc = new Scanner(System.in);
////        int n = 5;
////        int sum = 0;
////        int seconds = 0;
////        System.out.println("HI");
//////        for (int i = 0; i < n; i++) {
//////            int length = sc.nextInt();
////            int[] array = {7, 4, 4, 3, 2};
////            for (int j = 0; j < array.length; j++) {
////                sum += array[j];
////            }
////            while (sum > 0) {
////                for (int k = 0; k < array.length - 1; k++) {
////                    if (array[k] > array[k + 1]) {
////                        array[k] -= 1;
////                        sum = sum - 1;
////                    }
////                }
////                if(array[n - 1] > 0) {
////                    array[n - 1]--;
////                    sum -= 1;
////
////                }
////                System.out.println("HEllo");
////                seconds++;
////            }
//////        }
////        System.out.println(seconds);
////    }
////}


import java.util.Scanner;
public class BasilsGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 0; tc < t; ++tc) {
            int n = sc.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < h.length; ++i) {
                h[i] = sc.nextInt();
            }
            System.out.println(solve(h));
        }
        sc.close();
    }
    static int solve(int[] h) {
        int result = h[h.length - 1];
        for (int i = h.length - 2; i >= 0; --i) {
            result = Math.max(h[i], result + 1);
        }
        return result;
    }
}