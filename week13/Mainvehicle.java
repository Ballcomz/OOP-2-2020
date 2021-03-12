package week13;

public class Mainvehicle {
    public static void main(String[] args) {

        Vehicle ship = new Ship();
        Vehicle car = new Car();
        Vehicle jet = new Jet();

        System.out.println(ship.move());
        System.out.println(car.move());
        System.out.println(jet.move());
    }
}
