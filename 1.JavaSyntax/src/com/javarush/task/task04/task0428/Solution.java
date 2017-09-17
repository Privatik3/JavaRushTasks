package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = {
                Integer.parseInt(buffRead.readLine()),
                Integer.parseInt(buffRead.readLine()),
                Integer.parseInt(buffRead.readLine())
        };

        int positiveNumbers = 0;
        for (int number : numbers) {
            if (number > 0) positiveNumbers++;
        }

        System.out.println(positiveNumbers);
    }
}
