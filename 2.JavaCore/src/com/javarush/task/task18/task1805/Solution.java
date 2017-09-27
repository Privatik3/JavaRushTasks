package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buffRead.readLine();

        FileInputStream fileInput = new FileInputStream(new File(fileName));
        TreeSet<Integer> allBytes = new TreeSet<>();

        while (fileInput.available() > 0) {
            int currentByte = fileInput.read();
            allBytes.add(currentByte);
        }

        for (Integer bytes : allBytes ) {
            System.out.print(bytes + " ");
        }

        fileInput.close();
    }
}
