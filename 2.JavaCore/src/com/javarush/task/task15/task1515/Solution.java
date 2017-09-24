package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
1. В статическом блоке считайте две переменные с консоли А и В с типом int.
2. Не забыть про IOException, который надо обработать в блоке catch.
3. Закрыть поток ввода методом close().
*/

public class Solution {
    public static int A;
    public static int B;

    static {
        BufferedReader buffRead = null;
        try {
            buffRead = new BufferedReader(new InputStreamReader(System.in));
            A = Integer.parseInt(buffRead.readLine());
            B = Integer.parseInt(buffRead.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buffRead.close();
            } catch (IOException e) {

            }
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
