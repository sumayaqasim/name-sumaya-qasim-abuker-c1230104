import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Characters");

        for (String plidrom = input.nextLine(); ; plidrom = input.nextLine()) {
            char first = plidrom.charAt(0);
            char last = plidrom.charAt(plidrom.length() - 1);

            if (first == last) {
                System.out.println(plidrom + " is palindrome");
            } else {
                System.out.println(plidrom + " is not palindrome");
                break;
            }
        }
    }

}