package TestDynamic;

public class DynamicEx1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Puddle();

        dog1.run();
        dog2.run();
    }
}

class Dog {
    public void run() {
        System.out.println("Dog run");
    }

}

class Puddle extends Dog {
    public void run() {
        System.out.println("Puddle run");

    }
}
