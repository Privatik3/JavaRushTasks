package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        double period = (Double.parseDouble((new BufferedReader(new InputStreamReader(System.in))).readLine())) % 5;

        if (period <=3) System.out.println("зелёный");
        else if (period <=4) System.out.println("жёлтый");
        else System.out.println("красный");
    }
}