package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = {
            Integer.parseInt(buffRead.readLine()),
            Integer.parseInt(buffRead.readLine()),
            Integer.parseInt(buffRead.readLine())
        };

        Arrays.sort(numbers);
        System.out.println(numbers[1]);
    }
}
