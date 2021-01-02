package week2;

public class Mainstudent3 {
    public static void main(String[] args) {
        Student bruno = new Student();
        bruno.name = "Bruno";
        bruno.studentID = "4921362";
        bruno.score = 40;

        Student salah = new Student();
        salah.name = "Salah";
        salah.studentID = "402561";
        salah.score = 56;

        Student ronaldo = new Student();
        ronaldo.name = "Ronaldo";
        ronaldo.studentID = "489653";
        ronaldo.score = 88; 

        bruno.printScore();    
        bruno.calculateGrade();
        salah.printScore();
        salah.calculateGrade();
        ronaldo.printScore();
        ronaldo.calculateGrade();
    }
    
}
