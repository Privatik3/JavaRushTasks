package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        for (int j = 0; j < 10; j++) {
            try {
                float i = 1 / 0;

            } catch (Exception e) {
                exceptions.add(e);
            }

        }

    }
}
