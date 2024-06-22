import java.io.File;
import java.util.PriorityQueue;

public class Top10Files {
    public static PriorityQueue<File> heap = new PriorityQueue<>((e1, e2) -> (int) (e2.length() - e1.length()));

    public static void main(String[] args) {
        PriorityQueue<File> heap = top10Files(new File("C:\\Users\\indug\\mysite\\trackerapp"));
        for (int i = 0; i < 10; i++) {
            File file = heap.poll();
            System.out.println(file);
        }
    }
    public static PriorityQueue<File> top10Files(File path) {
        File[] files = path.listFiles();
        if (files == null) return null;

        for (File file : files) {
            if (file.isFile()) {
                heap.add(file);

            } else {
                top10Files(file);
            }
        }
        return heap;
    }

//    public static File findLargest(File path) {
//        FileData fd = new FileData();
//        top10Files(path);
//        return new File(fd.filePath);
//    }

    }

 class FileData {
    String filePath = "";
    long fileLength = Long.MIN_VALUE;
}
