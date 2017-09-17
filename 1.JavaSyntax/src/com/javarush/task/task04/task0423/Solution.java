package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String name = buffRead.readLine();
        int age = Integer.parseInt(buffRead.readLine());

        if (age > 20)
            System.out.println("И 18-ти достаточно");
    }
}
