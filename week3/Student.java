package week3;

public class Student {
    //the attribute of the class
    private int studentID = 999;
    private String firstName = "Hello";
    private int age = 99;
    //the method of the class
    int getStudentID(){
        return studentID;
    }
    int getAge(){
        return age;
    }
    public void setStudentID(int studentID, int age){
        this.studentID = studentID;
        this.age = age;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
}
