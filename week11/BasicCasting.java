package week11;

public class BasicCasting {
    public static void main(String[] args) {
        int num = 100;
        double a = num; //Implicit casting
        System.out.println(a);

        int num1 = 1;
        int num2 = 2;
        double num3 = num1/num2;
        System.out.println(num3);

        num3 = (double)num1/(double)num2;
        System.out.println(num3);
    }
}
