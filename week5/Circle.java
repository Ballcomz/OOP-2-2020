package week5;

public class Circle {
    private double originX, originY, radius;
    private double area, circum;


    public Circle(){
        originX = 0;
        originY = 0;
        radius = 0;
    }
    public void setCircle(double x,double y,double r){
        originX = x;
        originY = y;
        radius =r;
    }
    public double getRadius(){
        return radius;
    }
    public double getX(){
        return originX;
    }
    public double getY(){
        return originY;
    }

    
    
    
    
}
