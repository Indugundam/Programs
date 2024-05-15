import java.util.Scanner;

import static java.lang.System.exit;

public class Cases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();
        do {
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Camel case: " + camelCase(string));
                    break;
                }
                case 2: {
                    System.out.println("Pascal case: " + pascalCase(string));
                    break;
                }
                case 3: {
                    System.out.println("snake case: " + snakeCase(string));
                    break;
                }
                case 4: {
                    exit(0);
                    break;
                }


            }
        } while (true);

    }

    public static String camelCase(String string) {
        String words[] = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        String str = words[0].substring(1);
        char ch = words[0].charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        stringBuilder.append(ch).append(str);

        for (int i = 1; i < words.length; i++) {
            String str1 = words[i].substring(1);
            char ch1 = words[i].charAt(0);
            if (ch1 >= 'a' && ch1 <= 'z') {
                ch1 = (char) (ch1 - 32);
            }
            stringBuilder.append(ch1).append(str1);
        }

        return stringBuilder.toString();
    }

    public static String pascalCase(String string) {
        String[] words = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            String str = word.substring(1);
            char ch = word.charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            stringBuilder.append(ch).append(str);
        }

        return stringBuilder.toString();
    }

    public static String snakeCase(String string) {
        String[] words = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word + "_");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }
}


