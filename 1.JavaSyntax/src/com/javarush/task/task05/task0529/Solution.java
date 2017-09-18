package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        String value;
        while (true) {
            value = buffRead.readLine();
            if (value.equals("сумма")) break;

            sum += Integer.parseInt(value);
        }

        System.out.println(sum);
    }
}
