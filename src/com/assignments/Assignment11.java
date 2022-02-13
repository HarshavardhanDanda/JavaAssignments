package com.assignments;
import java.io.*;
import java.io.File;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;


public class Assignment11 {
    public static <TypeKey> void main(String[] args) {

        try {
            File infile=new File("C:\\Users\\HP\\IdeaProjects\\Assignment2\\src\\com\\assignments\\Ass11scan.txt");
            BufferedReader br=new BufferedReader(new FileReader(infile));
            Map<Character, Integer> m = new HashMap<Character, Integer>();
            int c = 0;
            while((c = br.read()) != -1)
            {
                char character = (char) c;
                if (m.containsKey(character)){
                    m.put(character,m.get(character)+1);
                }
                else{
                    m.put(character,1);
                }

            }
            PrintWriter pw=new PrintWriter("Ass11Solution");
            for (Character name: m.keySet()) {
                String key = name.toString();
                String value = m.get(name).toString();
                pw.print(key);
                pw.print(" ");
                pw.println(value);

            }
            pw.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
