package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }

    // T(°F) = T(°C) × 1.8 + 32
    public static double convertCelsiumToFahrenheit(int celsium) {
        //напишите тут ваш код
        return celsium * 1.8d + 32;
    }
}