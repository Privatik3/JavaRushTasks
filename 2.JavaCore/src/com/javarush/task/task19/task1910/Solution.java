package com.javarush.task.task19.task1910;

/* 
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.

Результат вывести во второй файл.

http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F

Закрыть потоки.
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

        while (reader.ready()) {
            writer.write(reader.readLine().replaceAll("\\W", ""));
        }

        //закрываем потоки после использования
        reader.close();
        writer.close();
    }
}
