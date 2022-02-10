package harsha.assignment5.singleton;

public class Second {
    String strVar;
    public static Second getObject(String str){
        Second obj = new Second();
        obj.strVar=str;
        return obj;
    }
    public void printIt(){
        System.out.println("My name is "+strVar);
    }
}
