package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        int[] masInt = new int[10];

        for (int i = 9; i >= 0; i--) {
            masInt[i] = Integer.parseInt(buffRead.readLine());
        }

        for (int number :masInt) {
            System.out.println(number);
        }

    }
}

