package com.javarush.task.task18.task1809;

/* 
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static BufferedReader reader;
    public static FileOutputStream outputStream;
    public static FileInputStream inputStream;
    public static void main(String[] args) throws IOException {

        reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        inputStream = new FileInputStream(file1);
        outputStream = new FileOutputStream(file2);
        byte[] byffer = new byte[inputStream.available()];
        while (inputStream.available()>0) {
            int count = inputStream.read(byffer);
            for(int i=0, j=byffer.length-1; i<j; i++, j--) {
                byte zero= byffer[i];
                byffer[i]=byffer[j];
                byffer[j] = zero;
            }
            outputStream.write(byffer, 0, count);
        }

        inputStream.close();
        outputStream.close();


    }
}
