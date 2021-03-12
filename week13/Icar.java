package week13;

interface Icar {
    public void engineStart();

    public void changeGear(int newGear);

    public void turnLeft();

    public void turnRight();
}

class Mycar implements Icar {

    int gear = 0;

    public void engineStart() {
        System.out.println("car start");
    }

    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    public int Getgear() {
        return gear;
    }

    public void turnLeft() {
        System.out.println("Left light on");
    }

    public void turnRight() {
        System.out.println("Right light on");
    }
}