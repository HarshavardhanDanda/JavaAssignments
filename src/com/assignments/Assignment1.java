package com.assignments;
import java.io.*;
import java.util.regex.*;
import java.util.*;

public class Assignment1 {

    private static final File homeDirectory=new File("C:\\zemoso");


    public static void checkMatchingFiles()
    {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the file name to match OR Enter exit to exit");
            String input = scanner.nextLine();
            if(input.equals("exit"))
                return;
            Pattern pattern = Pattern.compile(input, Pattern.CASE_INSENSITIVE);
            printAbsolutePath(homeDirectory, pattern);
        }
    }
    public static void printAbsolutePath(File homeDirectory,Pattern pattern){
        File[] Files = homeDirectory.listFiles();
        for (File file : Files) {
            if (file.isDirectory())
                printAbsolutePath(file,pattern);
            else {
                Matcher matcher = pattern.matcher(file.getName());
                if(matcher.find())
                    System.out.println(file.getAbsolutePath());
            }
        }
    }
    public static void main(String[] args)
    {
        checkMatchingFiles();
    }
}//this is assignment1
