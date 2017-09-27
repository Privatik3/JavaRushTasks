package com.javarush.task.task18.task1820;

/* 
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = buffRead.readLine();
        String secondFileName = buffRead.readLine();

        PrintStream out = new PrintStream(new FileOutputStream(secondFileName));
        System.setOut(out);

        BufferedReader buffInput = new BufferedReader(new FileReader(new File(firstFileName)));
        String[] inputNumbers = buffInput.readLine().split(" ");
        buffInput.close();

        for (String num : inputNumbers ) {
            System.out.print(Math.round(Double.parseDouble(num)) + " ");
        }
        out.close();
    }
}
