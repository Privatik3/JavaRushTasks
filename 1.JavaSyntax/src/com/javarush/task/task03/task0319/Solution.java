package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код // Коля получает 3000 через 5 лет.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        int sum = Integer.parseInt(bufferedReader.readLine());
        int ages = Integer.parseInt(bufferedReader.readLine());

        System.out.println(name + " получает " + sum + " через " + ages + " лет.");
    }
}
