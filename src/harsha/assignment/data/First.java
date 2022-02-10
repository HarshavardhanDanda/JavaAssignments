package harsha.assignment.data;

public class First {
     int intVar;
     char charVar;
     public void printVar(){
         System.out.println(intVar);
         System.out.println(charVar);
     }
     public void printLocal(){
         int var1;
         int var2;
         //System.out.println(var1+var2);
         //java will assign default values to instance variables
         //but will not assign default values to local variable
         //local variables must be initialized or compile error will occur
     }

}
