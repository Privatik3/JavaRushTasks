package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[20];

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        //напишите тут ваш код
        for (int i = 0; i < 20; i++) {
            int value = Integer.parseInt(reader.readLine());
            mass[i] = value;

            if (maximum < value) maximum = value;
            if (minimum > value) minimum = value;
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
