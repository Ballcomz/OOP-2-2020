package week13;

public class Car extends Vehicle {
    public Car() {
        sound = "Bam Bam";
    }

    public String move() {
        return sound;
    }
}