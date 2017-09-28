package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        Map<String, Double> hashMap = new TreeMap<>();
        String fileName = args[0];

        BufferedReader buffFileReader = new BufferedReader(new FileReader(fileName));
        double maxValue = 0;
        while (buffFileReader.ready()) {
            String line = buffFileReader.readLine();
            String name = line.split(" ")[0];
            Double value = Double.parseDouble(line.split(" ")[1]);
            if (hashMap.containsKey(name)) {
                double newValue = hashMap.get(name) + value;
                hashMap.put(name, newValue);
                if (newValue > maxValue) maxValue = newValue;
            } else {
                hashMap.put(name, value);
                if (value > maxValue) maxValue = value;
            }
        }
        buffFileReader.close();

        for (Map.Entry<String, Double> pair : hashMap.entrySet()) {
            if (pair.getValue() == maxValue)
                System.out.println(pair.getKey());
        }
    }
}
