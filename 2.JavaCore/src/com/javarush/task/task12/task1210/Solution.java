package com.javarush.task.task12.task1210;

/* 
Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    static int max(int a, int b) {
        return a > b ? a : b;
    }
    static long max(long a, long b) {
        return a > b ? a : b;
    }

    static double max(double a, double b) {
        return a > b ? a : b;
    }
}
