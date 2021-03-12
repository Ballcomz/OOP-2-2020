package week13;

public class Ship extends Vehicle {

    public Ship() {
        sound = "BOOOOOOO...";
    }

    public String move() {
        return sound;
    }
}