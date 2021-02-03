package week8;

public class Dog extends Pet{
    String size;
    boolean shortHair;

    public Dog(String name,String species,String color,int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    
    public void dogRun(){
        System.out.println("My dog "+name+" is run to the jungle");
    }
    public void dogBark(){
        System.out.println(size+" bark Box Box!!");
    }
    public void dogHair() {
        System.out.println("Short hair: "+shortHair);   
    }
    
}
