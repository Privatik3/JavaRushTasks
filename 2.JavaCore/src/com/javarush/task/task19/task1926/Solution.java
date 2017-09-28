package com.javarush.task.task19.task1926;

/* 
1 Считать с консоли имя файла. Считать содержимое файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке.
2.2 вывести на экран.
3 Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String name = buffRead.readLine();
        buffRead.close();

        FileReader fr = new FileReader(name);
        BufferedReader fileReader = new BufferedReader(fr);

        while (fileReader.ready()) {
            StringBuilder stringBuilder = new StringBuilder(fileReader.readLine());
            System.out.println( stringBuilder.reverse().toString());
        }

        fr.close();
    }
}
