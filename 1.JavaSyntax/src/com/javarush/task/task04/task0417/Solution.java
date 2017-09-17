package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = {
                Integer.parseInt(buffRead.readLine()),
                Integer.parseInt(buffRead.readLine()),
                Integer.parseInt(buffRead.readLine())
        };

        printSameNumbers(numbers);
    }

    private static void printSameNumbers(int[] numbers) {

        if (numbers[0] == numbers[1] && numbers[0] == numbers[2])
            System.out.print(numbers[0] + " " + numbers[0] + " " + numbers[0]);
        else if (numbers[0] == numbers[1] || numbers[0] == numbers[2]) System.out.print(numbers[0] + " " + numbers[0]);
        else if (numbers[1] == numbers[2]) System.out.print(numbers[2] + " " + numbers[2]);
    }
}