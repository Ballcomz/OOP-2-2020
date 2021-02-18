package exam;

class Cat extends Pet {
    public String speak() {
        return "Meow Meow";
    }

    public static void main(String[] args) {
        Pet myCat = new Pet();
        myCat.setName("kitty");
        System.out.println("My name is " + myCat.getName());
        System.out.println(myCat.speak());
    }
}
