import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for percent
        System.out.print("Enter the student's percentage (e.g., 95.0, 89.5, etc.): ");
        double percent = scanner.nextDouble();

        // Determine GPA using if-else
        double gpa;
        if (percent >= 95.0 && percent <= 100.0) {
            gpa = 4.0;
        } else if (percent < 95.0 && percent >= 94.0) {
            gpa = 3.9;
        } else if (percent < 94.0 && percent >= 93.0) {
            gpa = 3.8;
        } else if (percent < 93.0 && percent >= 92.0) {
            gpa = 3.7;
        } else if (percent < 92.0 && percent >= 91.0) {
            gpa = 3.6;
        } else if (percent < 91.0 && percent >= 90.0) {
            gpa = 3.5;
        } else if (percent < 90.0 && percent >= 89.0) {
            gpa = 3.4;
        } else if (percent < 89.0 && percent >= 88.0) {
            gpa = 3.3;
        } else if (percent < 88.0 && percent >= 87.0) {
            gpa = 3.2;
        } else if (percent < 87.0 && percent >= 86.0) {
            gpa = 3.1;
        } else if (percent < 86.0 && percent >= 85.0) {
            gpa = 3.0;
        } else if (percent < 85.0 && percent >= 84.0) {
            gpa = 2.9;
        } else if (percent < 84.0 && percent >= 83.0) {
            gpa = 2.8;
        } else if (percent < 83.0 && percent >= 82.0) {
            gpa = 2.7;
        } else if (percent < 82.0 && percent >= 81.0) {
            gpa = 2.6;
        } else if (percent < 81.0 && percent >= 80.0) {
            gpa = 2.5;
        } else if (percent < 80.0 && percent >= 79.0) {
            gpa = 2.4;
        } else if (percent < 79.0 && percent >= 78.0) {
            gpa = 2.3;
        } else if (percent < 78.0 && percent >= 77.0) {
            gpa = 2.2;
        } else if (percent < 77.0 && percent >= 76.0) {
            gpa = 2.1;
        } else if (percent < 76.0 && percent >= 75.0) {
            gpa = 2.0;
        } else if (percent < 75.0 && percent >= 74.0) {
            gpa = 1.9;
        } else if (percent < 74.0 && percent >= 73.0) {
            gpa = 1.8;
        } else if (percent < 73.0 && percent >= 72.0) {
            gpa = 1.7;
        } else if (percent < 72.0 && percent >= 71.0) {
            gpa = 1.6;
        } else if (percent < 71.0 && percent >= 70.0) {
            gpa = 1.5;
        } else if (percent < 70.0 && percent >= 69.0) {
            gpa = 1.4;
        } else if (percent < 69.0 && percent >= 68.0) {
            gpa = 1.3;
        } else if (percent < 68.0 && percent >= 67.0) {
            gpa = 1.2;
        } else if (percent < 67.0 && percent >= 66.0) {
            gpa = 1.1;
        } else if (percent < 66.0 && percent >= 65.0) {
            gpa = 1.0;
        } else if (percent < 65.0 && percent >= 0.0) {
            gpa = 0.0;
        } else {
            System.out.println("Invalid percentage entered.");
            return;
        }

        // Output result
        System.out.println("The GPA for a percentage of " + percent + "% is: " + gpa);

        scanner.close();
    }
}
