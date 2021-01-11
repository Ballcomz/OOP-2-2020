package week5;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir1 = new Circle();
        cir1.setCircle(0.0, 0.0, 2.0);
        System.out.println("Area of cir1 = "+calArea(cir1.getRadius()));
        System.out.println("Circumferrene of cir1= "+calCir(cir1.getRadius()));
        
        Circle cir2 = new Circle();
        cir2.setCircle(1.0, 2.0, 3.0);

        System.out.println("Area of cir2 = "+calArea(cir2.getRadius()));
        System.out.println("Circumferrence of cir2 = "+calCir(cir2.getRadius()));
    
        Circle cir3 = new Circle();
        cir3.setCircle(3.0, 5.0, 1.0);

        System.out.println("Area of cir3 = "+calArea(cir3.getRadius()));
        System.out.println("Circumferrence of cir3 = "+calCir(cir3.getRadius()));
    
        Circle cir4 = new Circle();
        cir3.setCircle(-1.0, -10.0, -1.0);

        System.out.println("Area of cir4 = "+calArea(cir4.getRadius()));
        System.out.println("Circumferrence of cir4 = "+calCir(cir4.getRadius()));
        System.out.println("Is circle 1 intersec circle 2: "+isIntersec(cir1.getX(), cir2.getX(), cir1.getY(),cir2.getY(), cir1.getRadius(), cir2.getRadius()));
        System.out.println("Is circle 1 intersec circle 3: "+isIntersec(cir1.getX(), cir3.getX(), cir1.getY(), cir3.getY(), cir1.getRadius(), cir3.getRadius()));
    }

    public static double calArea(double r){
       double area = Math.PI*(Math.pow(r,2));
        return area;
    }
    public static double calCir(double r){
       double  circum = 2*(Math.PI)*r;
        return circum;
    }
    public static boolean isIntersec(double x1,double x2,double y1, double y2,double r1,double r2){
        double c = Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow(y2-y1, 2)));
        boolean answer;
        if(c<(r1+r2))
        answer = true;
        else
        answer = false;
        return answer;
    }
}
