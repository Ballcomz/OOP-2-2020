package week11;

public class ObjectCasting {
    public static void main(String args[]) {
        Animal creature;
        Cow daisy = new Cow();
        System.out.println(daisy); // prints: I am a Cow
        creature = daisy; // OK
        System.out.println(creature); // prints: I am a Cow
        creature = new Animal();
        System.out.println(creature); // prints: I am a Animal
        // daisy = creature; // Compile-time error, incompatible type
        if (creature instanceof Cow) {
            daisy = (Cow) creature; // OK but not an instance of Cow
            System.out.println(daisy);
        }
        Dog lucky = new Dog();
        System.out.println(lucky);
        if (lucky instanceof Cow) {
            lucky = (Dog) creature;
            System.out.println(lucky);
        }
    }
}

class Animal {
    @Override
    public String toString() {
        return "I am an Animal";
    }
}

class Cow extends Animal {
    @Override
    public String toString() {
        return "I am a Cow";
    }
}

class Dog extends Cow {
    @Override
    public String toString() {
        return "I am dog";
    }
}