package com.javarush.task.task19.task1919;

/* 
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] — String, [значение] — double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        Map<String, Double> hashMap = new TreeMap<>();
        String fileName = args[0];

        BufferedReader buffFileReader = new BufferedReader(new FileReader(fileName));
        while (buffFileReader.ready()) {
            String line = buffFileReader.readLine();
            String name = line.split(" ")[0];
            Double value = Double.parseDouble(line.split(" ")[1]);
            if (hashMap.containsKey(name)) {
                hashMap.put(name, hashMap.get(name) + value);
            } else {
                hashMap.put(name, value);
            }
        }
        buffFileReader.close();

        for (Map.Entry<String, Double> pair : hashMap.entrySet() ) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
