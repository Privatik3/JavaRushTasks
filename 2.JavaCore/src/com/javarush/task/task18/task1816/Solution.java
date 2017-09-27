package com.javarush.task.task18.task1816;

/* 
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        int countUA = 0;
        while (fileReader.ready()) {
            int tmpByte = fileReader.read();
            if ((tmpByte >= 65 && tmpByte <= 90) || (tmpByte >= 97 && tmpByte <= 122)) countUA++;
        }
        System.out.println(countUA);
        fileReader.close();
    }
}
