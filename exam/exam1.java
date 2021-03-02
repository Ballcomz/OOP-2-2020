package exam;

import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        String studentName = "John Cena";
        double gpa = 0.0;
        int credit, totalCredit;
        double gradeCredit = 0.0;
        int course;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("GPA Calculator.. Enter number of course:");
        course = keyboard.nextInt();

        for (int i = 1; i <= course; i++) {
            System.out.println("course No. " + i + " enter number of credit: ");
            credit = keyboard.nextInt();
            totalCredit = totalCredit + credit;

            System.out.println("course No. " + i + " enter the value of grade(0-4");
            double num2 = keyboard.nextDouble();
            gradeCredit = gradeCredit + (credit * num2);

        }
        gpa = gradeCredit / totalCredit;
        System.out.println("your GPA of this semester is : " + gpa);

    }
}
