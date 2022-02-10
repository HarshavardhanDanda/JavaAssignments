package Assignment7;

interface Interface1 {
    void method1();
    void method2();
    }

interface Interface2 {
    void method3();
    void method4();
}
interface Interface3 {
    void method5();
    void method6();
}
interface newInterface extends Interface1,Interface2,Interface3{
    void newMethod();
}
class mainClass{
    mainClass(){
    System.out.println("mainclass");
}}
class newClass extends mainClass implements newInterface {

    @Override
    public void method1() {
        System.out.println("this is method1");
    }

    @Override
    public void method2() {
        System.out.println("this is method2");
    }

    @Override
    public void method3() {
        System.out.println("this is method3");
    }

    @Override
    public void method4() {
        System.out.println("this is method4");
    }

    @Override
    public void method5() {
        System.out.println("this is method5");
    }

    @Override
    public void method6() {
        System.out.println("this is method6");
    }

    @Override
    public void newMethod() {
        System.out.println("this is method1");
    }

    void firstInterface(Interface1 interfacemethod1){
        interfacemethod1.method1();
        interfacemethod1.method2();
    }
}
public class Interfaces{
    public static void main(String[] args){
           newClass obj=new newClass();
           obj.method1();
           obj.firstInterface(obj);
    }
}


