package week11;

class Fruit {

}

class Apple extends Fruit {

}

class Orange extends Fruit {

}

class Banana {

}

public class TestObjectCasting {
    public static void main(String[] args) {
        Fruit object1 = new Fruit();
        Apple object2 = (Apple) object1;

    }

}
