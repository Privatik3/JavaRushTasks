package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        int positiveNumbers = 0;
        int negativeNumbers = 0;

        for (int i = 0; i < 3; i++) {
            int value = Integer.parseInt(buffRead.readLine());

            if (value > 0)
                positiveNumbers++;
            else if (value < 0)
                negativeNumbers++;
        }

        System.out.println("количество отрицательных чисел: " + negativeNumbers);
        System.out.println("количество положительных чисел: " + positiveNumbers);
    }
}
