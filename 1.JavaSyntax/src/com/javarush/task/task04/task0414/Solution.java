package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String tmpBuffered = bufferedReader.readLine();
        int value = Integer.parseInt(tmpBuffered);
        System.out.println("количество дней в году: " + isLeapYear(value));
    }

    public static int isLeapYear(int typeYear) {
        int delta;
        if ((typeYear % 400 == 0) & (typeYear % 100 == 0) & (typeYear % 4 == 0)) {
            delta = 366;
        } else if ((typeYear % 400 != 0) & (typeYear % 100 != 0) & (typeYear % 4 == 0)) {
            delta = 366;
        } else {
            delta = 365;
        }
        return delta;
    }
}