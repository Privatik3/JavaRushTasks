package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных.
Числа могу повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.
Каждую пару с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();

        while (true) {
            String value = reader.readLine();
            if (value.isEmpty()) break;

            String name = reader.readLine();
            int id = Integer.parseInt(value);
            hashMap.put(name, id);
        }

        for (Map.Entry<String, Integer> pair : hashMap.entrySet() ) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
