package com.javarush.task.task12.task1209;

/* 
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    static int min(int a, int b) {
        return a < b ? a : b;
    }
    static long min(long a, long b) {
        return a < b ? a : b;
    }

    static double min(double a, double b) {
        return a < b ? a : b;
    }
}
