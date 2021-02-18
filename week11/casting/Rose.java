package week11.casting;

public class Rose extends Flower {
  public void smell() // II
  {
    System.out.println("Rose gives rosy smell");
  }

  public static void main(String args[]) {
    Flower f = new Flower();
    Rose r = new Rose();

    f.smell(); // I
    r.smell(); // II

    f = r; // subclass to super class, it is valid
    f.smell(); // II

    // r = f; // super class to subclass, not valid
    r = (Rose) f; // explicit casting
    f.smell(); // II

  }
}