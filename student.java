import java.util.Scanner;
class Student {
    String name;
    int rollNumber;
    int[] marks = new int[6];
    void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = scanner.nextInt();
        System.out.println("Enter marks for six subjects: ");
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }
}
class Result extends Student {
    double aggregate;
    String grade;
    void calculateResult() {
        int total = 0;
        for (int i = 0; i < 6; i++) {
            total += marks[i];
        }
        aggregate = total / 6.0;

        if (aggregate > 75) {
            grade = "Distinction";
        } else if (aggregate >= 60) {
            grade = "1st Division";
        } else if (aggregate >= 50) {
            grade = "2nd Division";
        } else if (aggregate >= 40) {
            grade = "3rd Division";
        } else {
            grade = "Fail";
        }
    }
    void displayResult() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Aggregate: " + aggregate + "%");
        System.out.println("Grade: " + grade);
    }
}
class StudentGrade {
    public static void main(String[] args) {
        Result student = new Result();
        student.inputDetails();
        student.calculateResult();
        student.displayResult();
    }
}