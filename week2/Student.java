package week2;

public class Student {
    String name;
    String studentID;
    String faculty;
    String subject;
    int score;

    void printScore() {
        System.out.println("Score of " + studentID + " Name " + name + " is " + score);
    }

    int compareScore(Student otherStudent) {
        return otherStudent.score - this.score;
    }
    void calculateGrade(){
        if (score >=80)
        System.out.println("Score of "+name+" is PASS");
        else
        System.out.println("Score of "+name+" is FAIL");
    }
}
