package com.javarush.task.task18.task1821;

/* 
Программа запускается с одним параметром — именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        InputStreamReader input = new InputStreamReader(new FileInputStream(new File(fileName)));
        Map<Integer, Integer> allSymbols = new TreeMap<>();

        while (input.ready()) {
            int symbolCode = input.read();
            if (allSymbols.containsKey(symbolCode)) {
                allSymbols.put(symbolCode, allSymbols.get(symbolCode) + 1);
            } else {
                allSymbols.put(symbolCode, 1);
            }
        }

        input.close();
        for (Map.Entry<Integer, Integer> pair : allSymbols.entrySet() ) {
            int symbolCode = pair.getKey();
            System.out.println(((char)symbolCode) + " " + pair.getValue());
        }
    }
}
