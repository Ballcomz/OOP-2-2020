package week3;

public class StudentMember {
    // data member
    private String name;
    private String email;

    // constructor
    public StudentMember() {
        name = "Unassigned";
        email = "Unassigned";
    }

    // returns email of this student
    public String getEmail() {
        return email;
    }

    // returns the name of this student
    public String getName() {
        return name;
    }

    // assigns the email of this student
    public void setEmail(String address) {
        email = address;
    }

    // assigns the name of this student
    public void setName(String studentName) {
        name = studentName;
    }

}
