package week13;

public class Maincar {
    public static void main(String[] args) {

        Mycar tesla = new Mycar();

        tesla.engineStart();
        tesla.changeGear(2);
        System.out.println(tesla.Getgear());
        tesla.turnRight();
        tesla.turnLeft();

    }
}
