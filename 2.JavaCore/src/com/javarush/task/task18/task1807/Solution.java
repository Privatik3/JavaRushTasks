package com.javarush.task.task18.task1807;

/* 
С консоли считать имя файла.
Посчитать в файле количество символов ‘,‘, количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ‘,‘ // 44.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buffRead.readLine();
        int symbolCount = 0;

        FileInputStream fileInputStream = new FileInputStream(new File(fileName));
        while (fileInputStream.available() > 0) {
            if (fileInputStream.read() == 44) {
                symbolCount++;
            }
        }

        System.out.println(symbolCount);
        fileInputStream.close();
    }
}
