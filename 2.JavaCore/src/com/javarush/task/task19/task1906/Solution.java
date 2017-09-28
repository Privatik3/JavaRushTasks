package com.javarush.task.task19.task1906;

/* 
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным индексом.

Пример:
второй символ, четвертый символ, шестой символ и т.д.

Закрыть потоки ввода-вывод
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String firsFile = buffRead.readLine();
        String secondFile = buffRead.readLine();
        buffRead.close();

        FileReader reader = new FileReader(firsFile);
        FileWriter writer = new FileWriter(secondFile);

        int byteIndex = 1;
        while (reader.ready()) {
            int data = reader.read();
            if (byteIndex % 2 == 0) {
                writer.write(data);
            }
            byteIndex++;
        }

        //закрываем потоки после использования
        reader.close();
        writer.close();
    }
}
