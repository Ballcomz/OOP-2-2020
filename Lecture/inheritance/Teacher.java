package Lecture.inheritance;

public class Teacher extends Person {
    String course;
    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void teach(){
        System.out.println(name+" is teaching "+course);
    }
}
