package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buffRead.readLine();

        FileInputStream fileInput = new FileInputStream(new File(fileName));
        int maxByte = 0;

        while (fileInput.available() > 0) {
            int currentByte = fileInput.read();
            if (maxByte < currentByte) {
                maxByte = currentByte;
            }
        }
        System.out.println(maxByte);

        fileInput.close();
    }
}
