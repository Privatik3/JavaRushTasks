package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("Minimum = " + min(numbers[0], numbers[1],numbers[2],numbers[3],numbers[4]));
    }


    public static int min(int a, int b, int c, int d, int e) {
        int[] sortMas = new int[] { a, b, c, d, e};
        Arrays.sort(sortMas);
        return sortMas[0];
    }
}
