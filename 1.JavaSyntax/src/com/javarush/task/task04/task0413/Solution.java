package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String[] days = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};

        int dayNumber = Integer.parseInt(buffRead.readLine());

        if (dayNumber > 7 || dayNumber < 1) {
            System.out.println("такого дня недели не существует");
            return;
        }

        System.out.println(days[dayNumber - 1]);
    }
}