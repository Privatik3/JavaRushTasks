package com.javarush.task.task19.task1908;

/* 
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String firsFile = buffRead.readLine();
        String secondFile = buffRead.readLine();
        buffRead.close();

        BufferedReader reader = new BufferedReader(new FileReader(firsFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(secondFile));

        String fullFile = "";
        while (reader.ready()) {
            fullFile += (char) reader.read();
        }

        for (String element : fullFile.split("\\s")) {
            if (element.matches("\\d+")) {
                writer.write(element.toCharArray());
                writer.write(' ');
            }
        }

        //закрываем потоки после использования
        reader.close();
        writer.close();
    }
}
