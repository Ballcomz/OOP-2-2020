package week3;

public class TestClass {
    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println(student1.getFirstName());
        student1.setFirstName("Kittitouch");
        System.out.println(student1.getFirstName());
        student1.setStudentID(632110001, 19);
        System.out.println(student1.getStudentID());
        System.out.println(student1.getAge());
    }
    
}
