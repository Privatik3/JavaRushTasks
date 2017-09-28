package com.javarush.task.task19.task1909;

/* 
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла и заменить все точки «.» на знак «!«.
Результат вывести во второй файл.
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
            writer.write(reader.readLine().replaceAll("\\.", "!"));
        }

        //закрываем потоки после использования
        reader.close();
        writer.close();
    }
}
