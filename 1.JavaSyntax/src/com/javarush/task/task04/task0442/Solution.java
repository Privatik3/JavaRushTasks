package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int num = 0;
        while (num != -1) {
            num = Integer.parseInt(reader.readLine());
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
