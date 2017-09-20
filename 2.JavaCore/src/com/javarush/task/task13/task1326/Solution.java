package com.javarush.task.task13.task1326;

/* 
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader cnsReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(cnsReader.readLine())))) {
            while (br.ready()) {
                Integer num = Integer.parseInt(br.readLine());
                if (num % 2 == 0)
                    evenNumbers.add(num);
            }
        }

        Collections.sort(evenNumbers);
        for (Integer num : evenNumbers)
            System.out.println(num);
    }
}
