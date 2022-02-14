package Assignment6;



public class constructor {
    String name;
    int age;
    public constructor(String name)
    {
        this.name=name;
        System.out.println(this.name);
    }
    public constructor(int age) {
        new constructor("Mani");
        this.age=age;
    }

    public static void main(String[] args)
    {
        constructor example=new constructor(45);
        System.out.println(example.name);
        System.out.println(example.age);
        constructor[] array=new constructor[3];
        array[0]=new constructor("Harsha");

    }
}
