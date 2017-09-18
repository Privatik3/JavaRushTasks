package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        int maxLength = 0, minLength = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            String value = buffRead.readLine();
            list.add(value);
            if (maxLength < value.length())
                maxLength = value.length();

            if (minLength > value.length())
                minLength = value.length();
        }

        for (String s : list) {
            if (s.length() == maxLength || s.length() == minLength) {
                System.out.println(s);
                break;
            }
        }
    }
}
