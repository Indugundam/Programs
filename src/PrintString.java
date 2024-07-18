public class PrintString {
    public static void main(String[] args) {
        String string = "s uar\ney t!\neole ";
        printVerticalToHorizontalWriting(string);
    }

    public static void printVerticalToHorizontalWriting(String string) {
        String[] words = string.split("\n");
        for(int i = 0; i < words[0].length(); i++){
            for (String word : words) {
                System.out.print(word.charAt(i));
            }
        }
    }
}

//s uar
//ey t!
//eole
//see you later!