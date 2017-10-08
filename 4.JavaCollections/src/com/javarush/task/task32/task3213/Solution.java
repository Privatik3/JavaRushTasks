package com.javarush.task.task32.task3213;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Spwwz(Lxtrz");
        System.out.println(decode(reader, -5));  //Hello Amigo

    }

    public static String decode(StringReader reader, int key) throws IOException {

        StringWriter result = new StringWriter();
        if (reader == null) return result.toString();

        int read;
        while ((read = reader.read()) != -1) {
            result.write(read + key);
        }

        return result.toString();
    }

}
