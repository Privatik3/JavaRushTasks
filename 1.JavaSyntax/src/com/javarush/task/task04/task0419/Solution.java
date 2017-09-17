package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int aNumber = Integer.parseInt(bufferedReader.readLine());
        int bNumber = Integer.parseInt(bufferedReader.readLine());
        int cNumber = Integer.parseInt(bufferedReader.readLine());
        int dNumber = Integer.parseInt(bufferedReader.readLine());

        printMaxNumber(aNumber, bNumber, cNumber, dNumber);
    }

    private static void printMaxNumber(int aNumber, int bNumber, int cNumber, int dNumber) {

        if (getBiggerNumber(aNumber, bNumber) > getBiggerNumber(cNumber, dNumber))
            System.out.println(getBiggerNumber(aNumber, bNumber));
        else
            System.out.println(getBiggerNumber(cNumber, dNumber));
    }

    private static int getBiggerNumber(int aNumber, int bNumber) {
        if (aNumber > bNumber)
            return aNumber;
        else
            return bNumber;
    }
}
