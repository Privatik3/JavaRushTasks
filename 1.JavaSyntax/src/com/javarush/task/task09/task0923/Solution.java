package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая — только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> vowelCharters = new ArrayList<>();
        ArrayList<String> anotherCharters = new ArrayList<>();
        String inputString = buffRead.readLine();

        for (int i = 0; i < inputString.length(); i++) {
            if (isVowel(inputString.charAt(i))) {
                vowelCharters.add(inputString.charAt(i) + " ");
            } else {
                if (inputString.charAt(i) != ' ')
                    anotherCharters.add(inputString.charAt(i) + " ");
            }
        }

        for (String s : vowelCharters) {
            System.out.print(s);
        }

        System.out.println();

        for (String s : anotherCharters) {
            System.out.print(s);
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}