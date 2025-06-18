import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER NUMBER: ");
        int num = input.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " IS PRIME    number.");
        } else {
            System.out.println(num + " is not prime number.");
        }
    }
}


