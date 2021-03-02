package Lecture.inheritance;

public class TestOverriding {
    public static void main(String[] args) {
        A a = new B();
        a.p(10);
        a.p(10.0);
    }

    class B {
        public void p(double i) {
            System.out.println(i * 2);
        }
    }

    class A extends B {
        public void p(Double i) {
            System.out.println(i);
        }
    }
}
