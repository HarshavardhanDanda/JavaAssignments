package com.assignments;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;

public class Assignment3
{
    public static int pingHost(String host) throws IOException
    {
        long start=System.currentTimeMillis();
        System.out.println("the start time is "+ start);
        if(!InetAddress.getByName(host).isReachable(2000)){
            return -1;
        }

        long current=System.currentTimeMillis();
        System.out.println("the current time is "+ current);
        long diff=current-start;
        return(int)(diff);
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println("Time required to reach Host "+pingHost("192.168.43.67"));
        ArrayList<Integer> array = new ArrayList<>();
        int n=0;
        while(n<5){
            int input=pingHost("192.168.43.67");
            System.out.println(input);
            array.add(input);
            n+=1;
            System.out.println();
        }
        Collections.sort(array);
        System.out.println(array.get(2));

    }
}