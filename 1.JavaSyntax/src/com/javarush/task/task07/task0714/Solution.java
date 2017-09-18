package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Введи с клавиатуры 5 слов в список строк. Удали 3 — ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String value = buffRead.readLine();
            list.add(value);
        }

        list.remove(2);

        for (int i = list.size() -1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}


