package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(buffRead.readLine());

        if (value == 0) {
            System.out.println("ноль");
            return;
        }

        if (value > 0){
            System.out.print("положительное ");
        } else {
            System.out.println("отрицательное ");
        }

        if (value % 2 == 0) {
            System.out.println("четное число");
        } else {
            System.out.println("нечетное число");
        }
    }
}
