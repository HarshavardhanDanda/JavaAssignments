package com.assignments;

public class Assignment8 {
    public static void CreateException(String name, char gender, int age) throws nameException, genderException, ageException{
        if (!name.equals("harsha")){
            throw new nameException();
        }
        if (gender!=('M')){
            throw new genderException();
        }
        if (age!=21){
            throw new ageException();
        }

    }
    public static void main(String[] args){
        try{
            CreateException("mani",'F',20);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            System.out.println("this is finally block");
        }
    }
}
class nameException extends Exception{
    public String toString(){
        return ("your name is harsha");
    }
}
class genderException extends Exception{
    public String toString(){
        return("your gender is male");
    }
}
class ageException extends Exception{
    public String toString(){
        return("your age is 21");
    }
}
//hahahhdjfhdhf
