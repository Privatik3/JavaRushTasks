package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int aNumber = Integer.parseInt(bufferedReader.readLine());
        int bNumber = Integer.parseInt(bufferedReader.readLine());

        if (aNumber < bNumber)
            System.out.println(aNumber);
        else
            System.out.println(bNumber);
    }
}