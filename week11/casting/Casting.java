package week11.casting;

public class Casting {
    public static void main(String[] args) {
    Animal pet1 = new Animal("red", 2);  
    Dog pet2= new Dog("Black",4);
    Fish pet3 = new Fish("blue", 0);
    
    pet1 = pet2;
    pet2 = (Dog) pet1;
    System.out.println("------Pet1");
    pet1.showColor();
    pet1.showLeg();
    System.out.println("------Pet2");
    pet2.showColor();
    pet2.showLeg();
    System.out.println("------Pet3");
    pet3.showColor();
    pet3.showLeg();
    }
    
}
