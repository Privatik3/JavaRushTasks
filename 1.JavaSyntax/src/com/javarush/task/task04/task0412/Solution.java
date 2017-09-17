package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        int someNumber = Integer.parseInt(buffRead.readLine());

        if (someNumber == 0) {
            System.out.println(0);
        } else if (someNumber < 0) {
            System.out.println(someNumber + 1);
        } else {
            System.out.println(someNumber * 2);
        }

    }

}