package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/* 
Использование TreeSet
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        String allLines = String.join("",Files.readAllLines(Paths.get(args[0]))).toLowerCase();
        String letters = String.join("", allLines.split("\\W"));

        TreeSet<String> sorterLetters = new TreeSet<>();
        sorterLetters.addAll(Arrays.asList(letters.split("")));

        int letterCount = 0;
        for (String letter : sorterLetters) {
            if (++letterCount > 5) break;
            System.out.print(letter);
        }
    }
}
