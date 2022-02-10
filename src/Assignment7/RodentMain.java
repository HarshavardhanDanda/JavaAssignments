package Assignment7;


import Assignment7.Gerbil;
import Assignment7.Hamster;
import Assignment7.Mouse;
import Assignment7.Rodent;

public class RodentMain{
    public static void main(String[] args) {
         Rodent[] rodent=new Rodent[3];
         //upcasting
         rodent[0]=new Mouse();
         rodent[0].hasEars();
         rodent[0].hasTail();

         System.out.println();
         rodent[1]=new Gerbil();
         rodent[1].hasEars();
         rodent[1].hasTail();
         System.out.println();
         
         rodent[2]=new Hamster();
         rodent[2].hasEars();
         rodent[2].hasTail();





    }
}
