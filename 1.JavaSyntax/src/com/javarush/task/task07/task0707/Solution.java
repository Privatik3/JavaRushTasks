package com.javarush.task.task07.task0707;

import java.util.ArrayList;
import java.util.Arrays;

/* 
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>(5);
        list.add("Test");
        list.add("Test");
        list.add("Test");
        list.add("Test");
        list.add("Test");

        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
