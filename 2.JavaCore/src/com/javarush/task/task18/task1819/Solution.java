package com.javarush.task.task18.task1819;

/* 
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String firsFile = buffRead.readLine();
        String secondFile = buffRead.readLine();

        FileInputStream firstFileInput = new FileInputStream(firsFile);
        FileInputStream secondInputStream = new FileInputStream(new File(secondFile));

        byte[] second = new byte[secondInputStream.available()];
        secondInputStream.read(second);

        byte[] first = new byte[firstFileInput.available()];
        firstFileInput.read(first);

        byte[] mergedFiles = new byte[second.length + first.length];
        System.arraycopy(second, 0, mergedFiles, 0, second.length);
        System.arraycopy(first, 0, mergedFiles, second.length,  first.length);

        firstFileInput.close();
        secondInputStream.close();

        FileOutputStream firstFileOutput = new FileOutputStream(firsFile, false);
        firstFileOutput.write(mergedFiles);

        firstFileOutput.close();
    }
}
