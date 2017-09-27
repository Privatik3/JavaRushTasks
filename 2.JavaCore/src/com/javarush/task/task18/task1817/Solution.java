package com.javarush.task.task18.task1817;

/* 
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
4. Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);

        double spaceCount = 0.0, allCharters = 0.0;
        while (fileReader.ready()) {
            int tmpByte = fileReader.read();
            if ((char)tmpByte == ' ')
                spaceCount++;

            allCharters++;
        }

        System.out.printf("%.2f", ((spaceCount / allCharters) * 100));
        fileReader.close();
    }
}
