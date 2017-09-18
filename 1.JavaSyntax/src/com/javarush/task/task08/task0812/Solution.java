package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> countSame = new ArrayList<>();
        int count = 1;
        int num = 0;
        int tempNum = 0;
        int max = 1;

        for (int i = 0; i < 10; i++) {
            tempNum = num;
            num = Integer.parseInt(bf.readLine());
            list.add(num);
            if (num == tempNum) {
                count++;
                if (i == 9) countSame.add(count);
            } else if (count != 1) {
                countSame.add(count);
                count = 1;
            }
        }
        for (int i = 0; i < countSame.size(); i++) {
            if (countSame.get(i) > max) max = countSame.get(i);
        }
        System.out.println(max);
    }
}