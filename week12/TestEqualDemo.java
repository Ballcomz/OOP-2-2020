package week12;

public class TestEqualDemo {

    public static void main(String[] args) {
        Number x = new Number(100.00);
        Number y = new Number(123.45);
        Number z = new Number(100.00);

        int a = x.hashCode();
        int b = y.hashCode();
        int c = z.hashCode();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("Test x and y " + x.equals(y));
        System.out.println("Test y and z " + y.equals(z));
        System.out.println("Test x equal z " + x.equals(z));
    }

}