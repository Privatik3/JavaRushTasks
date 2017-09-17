package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(buffRead.readLine());
        if (!(value > 0 && value < 1000)) return;

        if (value % 2 == 0) {
            System.out.println("четное ");
        } else {
            System.out.println("нечетное ");
        }

        if (String.valueOf(value).length() == 1) {
            System.out.println("однозначное число");
        } else if (String.valueOf(value).length() == 2) {
            System.out.println("двузначное число");
        } else {
            System.out.println("трехзначное число");
        }
    }
}
