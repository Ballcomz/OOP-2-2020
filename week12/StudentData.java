package week12;

public class StudentData {

    public static void main(String[] args) {
        // Student object include name,age,gpa
        Student std01 = new Student("Mark", 18, 4.00);
        Student std02 = new Student("Jane", 18, 2.20);
        Student std03 = new Student("Peter", 19, 3.50);
        Student std04 = new Student("Mark", 22, 1.75);

        // Write the equal statement to test the objects below
        // name
        System.out.println((std01.getName()).equals(std04.getName()));
        // age

        // gpa
    }

}
