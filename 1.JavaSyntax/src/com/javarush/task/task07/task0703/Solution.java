package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String[] masString = new String[10];
        int[] masInt = new int[10];

        for (int i = 0; i < 10; i++) {
            String value = buffRead.readLine();
            masString[i] = value;
            masInt[i] = value.length();
        }

        for (int number : masInt) {
            System.out.println(number);
        }
    }
}
