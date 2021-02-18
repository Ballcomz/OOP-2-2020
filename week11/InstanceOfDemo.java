package week11;

class A{

}
class B extends A{

}
class C {

}

public class InstanceOfDemo {
public static void main(String[] args) {
    A a = new A();
    B b = new B();
    Object c = new C();
    Object d = a;

    System.out.println(a instanceof A);
    System.out.println(b instanceof B);
    System.out.println(c instanceof C);
    System.out.println(b instanceof A);
    System.out.println(c instanceof A);
    System.out.println(d instanceof A);
    System.out.println(d instanceof B);
    }
}