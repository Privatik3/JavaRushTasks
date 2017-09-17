package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int aSide = Integer.parseInt(bufferedReader.readLine());
        int bSide = Integer.parseInt(bufferedReader.readLine());
        int cSide = Integer.parseInt(bufferedReader.readLine());

        if (isTriangleExist(aSide, bSide, cSide)) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }

    private static boolean isTriangleExist(int aSide, int bSide, int cSide) {
        return aSide + bSide > cSide &&
                bSide + cSide > aSide &&
                cSide + aSide > bSide;
    }
}