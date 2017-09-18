package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE, numberCount;

        //напишите тут ваш код
        numberCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numberCount; i++) {
            int value = Integer.parseInt(reader.readLine());
            if (maximum < value) {
                maximum = value;
            }
        }

        System.out.println(maximum);
    }
}
