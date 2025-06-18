import java.util.Scanner;
public class grades {

    static String[] names = new String[3];
    static int[] grades = new int[3];
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== Student Grade System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Show Report");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent(input);
                    break;
                case 2:
                    searchStudent(input);
                    break;
                case 3:
                    showReport();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void addStudent(Scanner input) {
        if (count >= 3) {
            System.out.println("Only 3 students allowed.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter grade (0 - 100): ");
        int grade = input.nextInt();
        input.nextLine(); // consume newline

        if (name.length() < 3 || grade < 0 || grade > 100) {
            System.out.println("Invalid input. Please try again.");
        } else {
            names[count] = name;
            grades[count] = grade;
            count++;
            System.out.println("Student added successfully.");
        }
    }

    static void searchStudent(Scanner input) {
        System.out.print("Enter the name of the student to search: ");
        String search = input.nextLine();

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Student found: " + names[i] + " - Grade: " + grades[i]);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void showReport() {
        if (count < 3) {
            System.out.println("Please add at least 3 students first.");
            return;
        }

        int sum = 0;
        int highest = grades[0];
        int lowest = grades[0];

        System.out.println("\n--- Student List ---");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " - " + grades[i]);
            sum += grades[i];

            if (grades[i] > highest) highest = grades[i];
            if (grades[i] < lowest) lowest = grades[i];
        }

        double average = (double) sum / count;
        System.out.printf("\nAverage Grade: %.2f\n", average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}
