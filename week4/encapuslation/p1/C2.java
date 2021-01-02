package week4.encapuslation.p1;

public class C2 {
    public int number;
    
    C1 obj = new C1();
    public C2(C1 obj) {
        this.obj = obj;
    }


  public int getNumber(){
      return number;
  }
  public void setNumber(int num){
        number = num;
  }

public static void main(String[] args) {   
}
}
  
