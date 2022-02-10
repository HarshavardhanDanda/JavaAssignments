package Assignment7;

public class Cycle {
    public void balance(){
        System.out.println("balance method in cycle");
    }
}
class Unicycle extends Cycle{
    public void balance(){
          System.out.println("balance method in Unicycle");
    }

}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("balance method in Bicycle");
    }
}
class Tricycle extends Cycle{

}
class Main{
    public static void main(String[] args){
        Cycle[] cycle=new Cycle[4];

        cycle[0]=new Cycle();
        cycle[1]=new Unicycle();
        cycle[2]=new Bicycle();
        cycle[3]=new Tricycle();

        cycle[1].balance();
        Unicycle unicycle= (Unicycle)cycle[1];//downcasting
        unicycle.balance();

        Tricycle tricycle=(Tricycle)cycle[3];
        tricycle.balance();//here there is no balance method in tricycle but we downcasted so, we can access balance method which is in base class


    }
}

