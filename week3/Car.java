package week3;

public class Car {
    private String manufactor = "xxxxxx";
    private String color = "xxxx";
    private double speed = 0.0;
    private double breakAngle = 0.0;
    private double speedUp = 0.0;

    public void setSpeed(double speed){
        this.speed = speed;
    }
    double getSpeed(){
        return speed;
    }
    public void setManufactor(String manufactor){
        this.manufactor = manufactor;
    }
    String getManufactor(){
        return manufactor;
    }
    public void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return color;
    }
    public void setBreakAngle(double breakAngle){
        this.breakAngle = breakAngle;
    }
    double getBreak(){
        return this.speed = this.speed - breakAngle;
    }
    public void moreSpeed(double speedUp){
        this.speedUp = speedUp;
    }
    
    double speedUp(){
        return this.speed = this.speed + speedUp;
    }
}
