package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        int total = 0;
        boolean inside = false;

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == 0) {
                    if (a[i][j] == 1 && inside == false) {
                        inside = true;
                        total++;
                    }
                    if (a[i][j] == 0)
                        inside = false;
                }
                else {
                    if (a[i][j] != a[i - 1][j])
                        if (a[i][j] == 1)
                            if (j == 0) total++;
                            else if (a[i][j] != a[i][j - 1]) total++;
                }
            }
        }
        return total;
    }
}
