package week2;

public class Mainstudent2 {
    public static void main(String[] args) {
        Student prayuth = new Student();
        prayuth.name = "Prayuth";
        prayuth.studentID = "632110001";
        prayuth.faculty = "Sciance";
        prayuth.score = 30;

        Student pokba = new Student();
        pokba.name = "Pokba";
        pokba.studentID = "632110002";
        pokba.faculty = "Camt";
        pokba.score = 75 ;

        prayuth.printScore();
        pokba.printScore();

        System.out.println(prayuth.compareScore(pokba));
    }
}
