package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
Закрыть потоки.
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buffRead.readLine();
        buffRead.close();

        FileReader fr = new FileReader(fileName);
        BufferedReader buffFiled = new BufferedReader(fr);

        while (buffFiled.ready()) {
            int enteringCount = 0;
            String line = buffFiled.readLine();
            for (int i = 0; i < words.size(); i++) {
                if (line.contains(words.get(i))) {
                    enteringCount++;
                }
            }
            if (enteringCount == 2) {
                System.out.println(line);
            }
        }
        fr.close();
        buffFiled.close();
    }
}
