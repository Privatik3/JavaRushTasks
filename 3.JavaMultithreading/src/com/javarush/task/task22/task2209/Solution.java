package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/*
В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставь все слова в таком порядке, чтобы последняя буква данного слова
совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
Вывести полученную строку на экран.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String name = buffRead.readLine();
        buffRead.close();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
        StringBuilder fullBody = new StringBuilder();
        while (fileReader.ready()) {
            fullBody.append(fileReader.readLine()).append(" ");
        }
        fileReader.close();

        StringBuilder result = getLine(fullBody.toString().split(" "));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if(words == null || words.length == 0) return new StringBuilder("");
        if(!words[0].isEmpty() && words.length == 1) return  new StringBuilder(words[0]);
        Arrays.sort(words);

        ArrayList<String> wordsArray = new ArrayList<>();
        Collections.addAll(wordsArray, words);
        wordsArray.remove(0);

        ArrayList<String> result = new ArrayList<>();
        result.add(words[0]);

        while (wordsArray.size() > 0) skip:{
            for (int i = 0; i < wordsArray.size(); i++) {
                String word = wordsArray.get(i).toLowerCase();
                String lastWord = result.get(result.size() - 1).toLowerCase();
                if (lastWord.charAt(lastWord.length() - 1) == word.charAt(0)) {
                    result.add(wordsArray.get(i));
                    wordsArray.remove(i);
                    break skip;
                }
            }
            result.addAll(wordsArray);
            break;
        }

        return converToString(result);
    }

    private static StringBuilder converToString(ArrayList<String> list) {
        StringBuilder result = new StringBuilder();

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String word = iterator.next();
            if (result.length() > 0) result.append(" ");
            result.append(word);
        }
        return result;
    }
}
