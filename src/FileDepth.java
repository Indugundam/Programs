public class FileDepth
{
    public static void main(String [] args) {
        String string = "C:\\Windows\\System32\\drivers\\http.sys";
        System.out.println(depthOfFile(string));
    }
    public static int depthOfFile(String string) {
        String[] words = string.split("\\\\");
        int depth =  words.length - 2;

        return depth;

    }
}
