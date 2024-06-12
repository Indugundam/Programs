import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileAPI {
    public static boolean isPathExists(String path, String searchFile) {
        File file = new File(path);
        String[] files = file.list();
        for (String f : files) {
            if (f.equals(searchFile)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<String> filteredFiles(String path, String extension) {
        ArrayList<String> arraylist = new ArrayList<>();
        File directory = new File(path);
        if (directory.exists()) {
            for (String file : directory.list()) {
                if (file.endsWith(extension)) {
                    arraylist.add(file);
                }
            }
        }
        return arraylist;
    }
    public static String largestFile(String path) {
        File directory = new File(path);
        int max_length = Integer.MIN_VALUE;
        String largestFile = null;
        for (String file : directory.list()) {
            if (file.length() > max_length) {
                max_length = file.length();
                largestFile = file;
            }
        }
        return largestFile;
    }

    public static File oldestFile(String path) {
        File directory = new File(path);
        if (!directory.isDirectory()) {
            return null;
        }

        File[] files = directory.listFiles();
        long epoch = Long.MAX_VALUE;
        File oldestFile = null;

        for (File file : files) {
            if (file.lastModified() < epoch) {
                epoch = file.lastModified();
                oldestFile = file;
            }
        }
        return oldestFile;

    }

    public static ArrayList<String> duplicateFiles(String path1, String path2) {
        ArrayList<String> arraylist = new ArrayList<>();
        HashSet<String> hashset = new HashSet<>();
        File directory1 = new File(path1);
        File directory2 = new File(path2);
        String[] files1 = directory1.list();
        String[] files2 = directory2.list();
        for (String file1 : files1) {
            hashset.add(file1);
        }
        for (String file2 : files2) {
            if (hashset.contains(file2)) {
                arraylist.add(file2);
            }
        }

        return arraylist;
    }

    public static void info(String path) {
        File file = new File(path);
        System.out.println(file.length());
        String[] files = file.list();
        for (String f : files) {
            File child = new File(path + f);
            Date date = new Date(child.lastModified());
            System.out.println(child.getPath() + "\n" + child.length() + " " + date);
        }
    }

    public static ArrayList<String> listOfFiles(String path) {
        ArrayList<String> arraylist = new ArrayList<>();
        File file = new File(path);
        if (file.exists()) {
            for (String f : file.list()) {
                arraylist.add(f);
            }
        }
        return arraylist;
    }

    public static HashMap<String, Integer> noOfFiles(String path) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        File file = new File(path);
        for (String f : file.list()) {
            Pattern pattern = Pattern.compile("\\.[a-zA-Z]+");
            Matcher matcher = pattern.matcher(f);
            if (matcher.find()) {
                String word = matcher.group();
                if (hashmap.containsKey(word)) {
                    int frequency = hashmap.remove(word);
                    frequency++;
                    hashmap.put(word, frequency);
                } else {
                    hashmap.put(word, 1);
                }
            }
        }


        return hashmap;
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\indug\\OneDrive\\Documents\\";
        FileAPI.info(path);
        boolean flag = FileAPI.isPathExists(path, "Anagrams.java");
        if (flag) {
            System.out.println("\nFile exists");
        } else {
            System.out.println("\nDoesn't exists");
        }
        ArrayList<String> arraylist = FileAPI.listOfFiles(path);
        for (String element : arraylist) {
            //System.out.println(element);
        }
        ArrayList<String> elements = FileAPI.filteredFiles(path, ".class");
        System.out.println("Files which ends with .class are: ");
        for (String element : elements) {
            //System.out.println(element);
        }
        HashMap<String,Integer> hashmap = FileAPI.noOfFiles(path);
        System.out.println(hashmap);

        System.out.println("Largest file in the directory" + path + "is" +FileAPI.largestFile(path));

        System.out.println("Oldest file in the directory " + path + "is " +FileAPI.oldestFile(path));

        String path1 = "C:\\Users\\indug\\mysite\\trackerapp\\";
        //ArrayList<String> arraylist1 = duplicateFiles(path, path1);
        ArrayList<String> arraylist1 = duplicateFiles(path, path1);
        for (String element : arraylist1) {
            System.out.println(element);
        }
    }
}


