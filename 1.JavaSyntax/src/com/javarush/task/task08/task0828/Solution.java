package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> months = new ArrayList<>();
        Collections.addAll(months, "January", "February", "March",
                "April", "May", "June", "July",
                "August", "September", "October", "November", "December");

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String monthName = buffRead.readLine();

        for (int i = 0; i < months.size(); i++) {
            if (monthName.equals(months.get(i))) {
                System.out.println(monthName + " is " + (i + 1) + " month");
                break;
            }
        }
    }
}
