import java.util.Random;
import java.util.Scanner;

public class psword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

        String allChars = upper + lower + digits + special;

        System.out.print("Enter desired password length: ");
        int length = input.nextInt();
        String password = "";
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(allChars.length());
            password += allChars.charAt(index);
        }

        System.out.println("Generated Password: " + password);
    }
}
