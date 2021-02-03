package week8;

public class Mypets {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lucky", "Pooddle", "brown", 2);

        dog1.size = "Small";
        dog1.shortHair = true;

        System.out.println("My dog");
        dog1.showPetData();
        dog1.dogRun();
        dog1.dogBark();
        dog1.dogHair();
    }
    
}
