package harsha.assignment5.main;

import harsha.assignment5.data.First;
import harsha.assignment5.singleton.Second;

public class Assignment5main {
    public static void main(String[] args) {
        First obj1 = new First();
        obj1.printVar();
        obj1.printLocal();

        Second obj2= Second.getObject("harsha");
        obj2.printIt();


    }


}
