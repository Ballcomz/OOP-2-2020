package week12;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    /*
     * @Override public boolean equals(Object obj) { if (obj == null) { return
     * false; } if (obj == this) { return true; }
     * 
     * return this.getName() == ((Student) obj).getName(); }
     */
}
