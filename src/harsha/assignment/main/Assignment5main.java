package harsha.assignment.main;

import harsha.assignment.data.First;
import harsha.assignment.singleton.Second;

public class Assignment5main {
    public static void main(String[] args) {
        First obj1 = new First();
        obj1.printVar();
        obj1.printLocal();

        Second obj2= Second.getObject("harsha");
        obj2.printIt();


    }


}
