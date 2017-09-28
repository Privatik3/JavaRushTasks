package com.javarush.task.task19.task1907;

/* 
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов «world«, которые встречаются в файле.
Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buffRead.readLine();
        buffRead.close();

        String fullFile = "";
        FileReader fileReader = new FileReader(fileName);
        while (fileReader.ready()) {
            fullFile += (char)fileReader.read();
        }
        fileReader.close();

        int counter = 0;
        for (String element : fullFile.split("[\\s\\p{P}]")) {
            if (element.equals("world")) counter ++; }

        System.out.println(counter);
    }
}
