import java.util.Scanner;

public class PhoneNumberValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the phone number: ");
        String phone = input.nextLine();
        if (isValidNumber(phone)) {
            System.out.println("Phone number is a valid Indian Number");
        } else {
            System.out.println("Invalid number");
        }

    }

    public static boolean isValidNumber(String phone) {
        phone = phone.replaceAll("\\s+", "");
        if (phone.length() != 13) {
            return false;
        }
        if (phone.substring(0, 3).equals("+91")) {

            for (int i = 3; i < phone.length(); i++) {
                if (!(phone.charAt(i) >= '0' && phone.charAt(i) <= '9')) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}