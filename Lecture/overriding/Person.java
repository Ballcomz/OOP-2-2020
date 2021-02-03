package Lecture.overriding;

public class Person {
    String name;
    int bornYear;

    public Person(String name, int bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }

    public void introduce() {
        System.out.print("My name is " + name + ",");
        System.out.println("I was born in " + bornYear + ".");
    }
}

class Sheriff extends Person {
    String workState;

    public Sheriff(String name, int bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }

    // overiding method
    public void introduce() {
        super.introduce();
        System.out.println("I'm a sheriff and work in " + workState + ".");
    }

}

class Teacher extends Person {
    String university;

    public Teacher(String name, int bornYear, String university) {
        super(name, bornYear);
        this.university = university;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a teacher and work in " + university + ".");
    }
}