import java.util.Scanner;

public class sential {
    public static void main(String[] args) {
        char letter = 'n';
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to add. or '" + letter + "' to exit.");
        char ch = Character.toLowerCase(input.next().charAt(0));
        while (ch != letter) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
            else {
                System.out.println("invalid.  enter a num or " + letter + " to exit.");
            }
            System.out.println(" character or '" + letter + "' to exit:");
            ch = Character.toLowerCase(input.next().charAt(0));
        }
        System.out.println("The sum is: " + sum);
        }
              }




