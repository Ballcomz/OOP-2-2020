package week4;

public class MainPerson {
    public static void main(String[] args) {
        //declar the person array
        Person[] person;
        person = new Person[10];
        //create the person[0] object
        person[0] = new Person();
        //Assign the data for person[0]
        person[0].setName("Peter Parker");
        person[0].setAge(20);
        person[0].setGender('M');
        //Show person[0] data
        for(int i =0;i<1;i++){
        System.out.println("Name of person "+i+" is "+person[i].getName());
        System.out.println("Age of person "+i+" is "+person[i].getAge());
        System.out.println("Gender of person "+i+" is "+person[i].getGender());
        System.out.println("---------------------------------");
        }
    }
    
}
