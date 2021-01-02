package week4.encapuslation.p1;

public class C1 {
    public int x;
    int y;
    private int z;

    public C1(){
        x = 5;
        y= 10;
        z = 15;
    }
    public int m1(int num){
        System.out.println("print from m1"+num);
        return 0;
    }
    void m2(){
        System.out.println("print from m2");
    }
    private void m3(){
        System.out.println("print from m3");
    }

    
}
