package com.assignments;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter a sentence:");
        Scanner input=new Scanner(System.in);
        s=input.nextLine();
        boolean b=Pattern.matches("[A-Z]{1}[a-zA-Z0-9\\s.]*[.]",s);
        if(b){
            System.out.println("Yes, The sentence starts with a capital letter and ends with a period.");
        }
        else{
            System.out.println("NO, The sentence doesn't start with a capital letter and end with a period.");
        }

    }
}
