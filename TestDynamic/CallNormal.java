package TestDynamic;

public class CallNormal {
    public static void main(String[] args) {
        NormalClass nc = new NormalClass(5, 7);
        int x = nc.getA();
        int y = nc.getB();

        System.out.println(x);
        System.out.println(y);
    }
}
