package com.javarush.task.task01.task0129;

/* 
Считаем длину окружности
*/

public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    // L = 2 * Pi * radius.
    public static void printCircleLength(int radius) {
        //напишите тут ваш код
        double PI = 3.14d;

        System.out.println(2 * PI * radius);
    }
}