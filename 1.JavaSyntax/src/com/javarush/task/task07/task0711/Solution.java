package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(buffRead.readLine());
        }

        for (int i = 0; i < 13; i++) {
            int lastIndex = list.size() - 1;
            String temString = list.get(lastIndex);
            list.remove(lastIndex);
            list.add(0, temString);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
