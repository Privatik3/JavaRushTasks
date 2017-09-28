package com.javarush.task.task19.task1923;

/* 
В метод main первым параметром приходит имя файла1, вторым — файла2.
Файл1 содержит строки со словами, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(args[0]);
        BufferedReader buffIn = new BufferedReader(fr);

        FileWriter fw = new FileWriter(args[1]);

        while (buffIn.ready()) {
            String line = buffIn.readLine();

            for (String word : line.split(" ")) {
                if (word.matches(".*[0-9]+.*")) {
                    fw.write(word + " ");
                }
            }
        }

        fr.close();
        fw.close();
    }
}
