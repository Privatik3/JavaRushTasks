package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String numberInString = String.valueOf(number);
        int sumResult = 0;

        for (int i = 0; i < numberInString.length(); i++) {
            sumResult += Character.getNumericValue(numberInString.charAt(i));
        }

        return sumResult;
    }
}