package week3;

public class Librarian {
    public static void main(String[] args) {
        StudentMember student1, student2;
        LibraryCard card1, card2;

        student1 = new StudentMember();
        student1.setName("Johny Silverhand");
        student1.setEmail("johny.s@cmu.ac.th");

        //student2 = new StudentMember();
        //student2.setName("Kittitouch.s");
        //student2.setEmail("kittitouch.s@cmu.ac.th");

        card1 = new LibraryCard();
        card1.setOwner(student1);
        card1.checkout(3);

        //card2 = new LibraryCard();
       // card2.setOwner(student2);
        //card2.checkout(4);
        
        System.out.println("Card1 info:");
        System.out.println(card1.toString() + "\n");

        //System.out.println("Card2 info:");
        //System.out.println(card2.toString() + "\n");
    }

}
