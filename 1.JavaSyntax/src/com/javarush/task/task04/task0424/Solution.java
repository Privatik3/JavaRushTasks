package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = Integer.parseInt(r.readLine());
        }
        if (x[0] == x[1] && x[1] != x[2]) System.out.println(3);
        else if (x[0] == x[2] && x[2] != x[1]) System.out.println(2);
        else if (x[2] == x[1] && x[1] != x[0]) System.out.println(1);

    }
}
