package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код // Я буду зарабатывать $50 в час
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Я буду зарабатывать $" + price + " в час");
    }
}
