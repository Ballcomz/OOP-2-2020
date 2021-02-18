<<<<<<< HEAD
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
=======

package week11;

class Animal {
  @Override
  public String toString() {
    return "I am an Animal"; 
  }
>>>>>>> 32de45af7fc8765071294a52d61d9633d6cff377
}

class Cow extends Animal {
    @Override
<<<<<<< HEAD
    public String toString() {
        return "I am a Cow";
    }
}

class Dog extends Cow {
    @Override
    public String toString() {
        return "I am dog";
    }
=======
  public String toString() {
    return "I am a Cow"; 
  }
}

public class ObjectCasting {
  public static void main(String args[]) {
    Animal creature;
    Cow daisy = new Cow();
    System.out.println( daisy); // prints: I am a Cow
    creature = daisy;        // OK
    System.out.println(creature); // prints: I am a Cow
    creature = new Animal();
    System.out.println(creature); // prints: I am a Animal
//    daisy = creature;     // Compile-time error, incompatible type
    //if (creature instanceof Cow) {
      daisy = (Cow) creature;   // OK but not an instance of Cow
      System.out.println( daisy);
    //}
  }
>>>>>>> 32de45af7fc8765071294a52d61d9633d6cff377
}