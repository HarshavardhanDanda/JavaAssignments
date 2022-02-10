package com.assignments;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
         String str;
         System.out.println("Enter any String");
         Scanner input=new Scanner(System.in);
         str=input.nextLine();
         String lower= str.toLowerCase();
         boolean b=checkAlpha(lower);
         if(b){
             System.out.println("Yes, the string contains all letters from a to z");
         }
         else{
             System.out.println("No, the string does not contains all letters from a to z");
         }

    }
    public static boolean checkAlpha(String str){
        int[] myArray=new int[26];

        for(int i=0;i<str.length();i++){
            int ascii=(int)str.charAt(i);
            myArray[ascii-97]=1;
        }

        for(int i=0;i<26;i++){
             if(myArray[i]==0){
                 return(false);
             }
        }
        return(true);
        }
    }
//newly added comment for pull request

