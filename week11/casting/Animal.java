package week11.casting;

public class Animal {
   private String color;
   private int leg;

   public Animal(String color, int leg){
       this.color = color;
       this.leg = leg;
   }
   public void showColor(){
       System.out.println(color);
   }
   public void showLeg(){
       System.out.println(leg);
   }
}


