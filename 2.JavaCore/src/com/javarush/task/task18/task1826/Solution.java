package com.javarush.task.task18.task1826;

/* 
fileName — имя файла, который необходимо зашифровать/расшифровать.
fileOutputName — имя файла, куда необходимо записать результат шифрования/дешифрования.
-e — ключ указывает, что необходимо зашифровать данные.
-d — ключ указывает, что необходимо расшифровать данные.

-e fileName fileOutputName
-d fileName fileOutputName
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args[0].equals("-e")) {
            encode(args[1], args[2]);
        } else if (args[0].equals("-d")) {
            decode(args[1], args[2]);
        }
    }

    public static void decode(String fileInName, String fileOutname) throws IOException {
        FileInputStream fis = new FileInputStream(fileInName);
        FileOutputStream fos = new FileOutputStream(fileOutname);
        if (!new File(fileOutname).exists()) new File(fileOutname).createNewFile();
        while (fis.available() > 0) fos.write(fis.read() - 1);
        fis.close();
        fos.close();
    }

    public static void encode(String fileInName, String fileOutname) throws IOException {
        FileInputStream fis = new FileInputStream(fileInName);
        FileOutputStream fos = new FileOutputStream(fileOutname);
        if (!new File(fileOutname).exists()) new File(fileOutname).createNewFile();
        while (fis.available() > 0) fos.write(fis.read() + 1);
        fis.close();
        fos.close();
    }

}
