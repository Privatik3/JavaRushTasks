package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("c:\\TestInput.txt"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {

        StringWriter stringWriter = new StringWriter();
        if (is == null) return stringWriter;

        try (BufferedReader buffRead = new BufferedReader(new InputStreamReader(is))) {
            while (buffRead.ready()) {
                stringWriter.write(buffRead.readLine());
            }
        }

        return stringWriter;
    }
}