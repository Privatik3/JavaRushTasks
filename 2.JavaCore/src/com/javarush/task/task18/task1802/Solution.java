package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buffRead.readLine();

        FileInputStream fileInput = new FileInputStream(new File(fileName));
        int minByte = 255;

        while (fileInput.available() > 0) {
            int currentByte = fileInput.read();
            if (minByte > currentByte) {
                minByte = currentByte;
            }
        }
        System.out.println(minByte);

        fileInput.close();
    }
}
