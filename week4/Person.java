package week4;

public class Person {
    //person attibute
    private String name;
    private int age;
    private char gender;

    //constructor
    public Person(){
        name = "Unassigned";
        age = 0;
        gender = 'M';
    }
    //return name of person
    public String getName(){
        return name;
    }
    //return age of person
    public int getAge(){
        return age;
    }
    //return gender of person
    public char getGender(){
        return gender;
    }
    
    //Assgins name of person
    public void setName(String personName){
        name = personName;
    }
    //Assigns age of person
    public void setAge(int personAge){
        age =  personAge;
    }
    //Assing gender of person
    public void setGender(char personGender){
        gender = personGender;
    }
}
