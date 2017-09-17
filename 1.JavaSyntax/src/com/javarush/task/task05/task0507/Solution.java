package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> input = new ArrayList<>();

        int value;
        while (true) {
            value = Integer.parseInt(buffRead.readLine());
            if (value == -1) break;
            input.add(value);
        }

        printAverage(input);
    }

    private static void printAverage(List<Integer> input) {
        double sum = 0;
        for (int i : input)
            sum += i;

        System.out.println(sum / input.size());
    }
}

