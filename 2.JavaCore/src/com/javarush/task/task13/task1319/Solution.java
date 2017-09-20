package com.javarush.task.task13.task1319;

import java.io.*;

/* 
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку «exit«.
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buffRead.readLine();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {

            while (true) {
                String line = buffRead.readLine();
                bufferedWriter.write(line + "\n");

                if (line.equals("exit")) break;
            }
        }
    }
}
