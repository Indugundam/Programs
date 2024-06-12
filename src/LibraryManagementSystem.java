import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.exit;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Library Management System");
            System.out.println("1.Add book\n2. Remove book\n3. Check out book\n4. Return book\n5. List book status\n6. Exit");
            System.out.println("Choose an option: ");
            int choice = input.nextInt();
            switch(choice) {
                case 1:
                    //Scanner input = new Scanner(System.in);
                    HashMap<String,Integer> hashmap = new HashMap<>();
                    System.out.println("Enter title: ");
                    String title = input.next();
                    System.out.println("Enter author: ");
                    String author = input.next();
                    System.out.println("Enter category: ");
                    String category = input.next();
                    System.out.println("Enter IBSN: ");
                    int IBSN = input.nextInt();
                    hashmap.put(title,IBSN);
                    System.out.println("Book added successfully");
                    break;
                case 2:
                    System.out.println("Enter IBSN number to remove");
                    int IBSN1 = input.nextInt();
                    //removeBook(hashmap);
                case 6:
                    exit(0);
                    break;

            }

        }
        while (true);
    }

    public static void addBook() {
        Scanner input = new Scanner(System.in);
        HashMap<String,Integer> hashmap = new HashMap<>();
        System.out.println("Enter title: ");
        String title = input.next();
        System.out.println("Enter author: ");
        String author = input.next();
        System.out.println("Enter category: ");
        String category = input.next();
        System.out.println("Enter IBSN: ");
        int IBSN = input.nextInt();
        hashmap.put(title,IBSN);
        System.out.println("Book added successfully");

    }
    public static void removeBook(HashMap<String,Integer> hashma) {

    }
}
