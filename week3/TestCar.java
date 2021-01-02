package week3;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setManufactor("Ferrari");
        car1.setColor("red");
        car1.setSpeed(100.0);

        System.out.println(car1.getSpeed());
        System.out.println(car1.getManufactor());
        System.out.println(car1.getColor());

        car1.setBreakAngle(10.00);
        System.out.println("Current speed= "+car1.getBreak());
        car1.setBreakAngle(20.0);
        System.out.println("Current speed= "+car1.getBreak());

        car1.moreSpeed(30.5);
        System.out.println("Current speed= "+car1.speedUp());

    }
}
