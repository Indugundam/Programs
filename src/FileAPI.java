import java.io.File;
import java.util.ArrayList;
import java.util.Date;

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

    public static void info(String path) {
        File file = new File(path);
        System.out.println(file.length());
        String[] files = file.list();
        for (String f : files) {
            File child = new File(path + f);
            Date date = new Date(child.lastModified());
            System.out.println(child.getPath() + "\n" + f.length() + " " + date);
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
            System.out.println(element);
        }
        ArrayList<String> elements = FileAPI.filteredFiles(path, ".class");
        System.out.println("Files which ends with .class are: ");
        for (String element : elements) {
            System.out.println(element);
        }


    }
}


