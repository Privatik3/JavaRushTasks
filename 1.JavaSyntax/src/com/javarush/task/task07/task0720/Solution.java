package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int n = Integer.parseInt(buffRead.readLine()), m = Integer.parseInt(buffRead.readLine());

        for (int i = 0; i < n; i++) {
            String value = buffRead.readLine();
            list.add(value);
        }

        for (int i = 0; i < m; i++) {
            String temp = list.get(0);
            list.remove(0);
            list.add(temp);
        }

        for (String s : list) {
            System.out.println(s);
        }

    }
}
