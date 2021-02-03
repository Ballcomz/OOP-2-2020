package Lecture.overriding;

public class Testoverride1 {
    public static void main(String[] args) {
        Person person1, person2, person3;
        person1 = new Person("Mark", 2001);
        person2 = new Sheriff("Mateo", 1988, "California");
        //person3 = new Teacher("Kittitouch", 1977, "CMU.");

        person1.introduce();
        person2.introduce();
        //person3.introduce();
    }
}
