import java.util.ArrayList;

public class varArgsExample {
    public static void main(String[] args) {
        String shortestString = shortestName("Albert Tross","Blowfish","Nick Olaus","Joe ji");
        String shortestString2 = shortestName2("Albert Tross","Blowfish","Nick Olaus","Joe ji");
        System.out.println(shortestString);
        System.out.println(shortestString2);
    }
    // If we consider the shortest name from both first and last names
    public static String shortestName(String... names) {
        if(names == null) {
            return "";
        }
        ArrayList<String> arraylist = new ArrayList<>();
        for(int i = 0; i < names.length; i++) {
            String[] names2 = names[i].split(" ");
            for(String name : names2) {
                arraylist.add(name);
            }
        }
        int shortestLength = Integer.MAX_VALUE;
        String shortestString = null;
        for(String ele : arraylist) {
            if(shortestLength > ele.length()) {
                shortestLength = ele.length();
                shortestString = ele;
            }
        }
        return shortestString;
    }

    //If we consider the shortest names from only first names
    public static String shortestName2(String... names) {
        if (names == null) {
            return "";
        }
        int shortestLength = Integer.MAX_VALUE;
        String shortestString = null;
        for (int i = 0; i < names.length; i++) {
            String[] names2 = names[i].split(" ");
            if (shortestLength > names2[0].length()) {
                shortestLength = names2[0].length();
                shortestString = names2[0];
            }
        }
        return shortestString;
    }
}
