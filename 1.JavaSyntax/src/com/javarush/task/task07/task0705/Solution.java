package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        int[] fullMas = new int[20];
        int[] firstHalf = new int[10];
        int[] secondHalf = new int[10];

        for (int i = 0; i < 20; i++) {
            int value = Integer.parseInt(buffRead.readLine());
            fullMas[i] = value;
            if (i <= 9) {
                firstHalf[i] = value;
            } else {
                secondHalf[i - 10] = value;
            }
        }

        for (int number : secondHalf) {
            System.out.println(number);
        }
    }
}
