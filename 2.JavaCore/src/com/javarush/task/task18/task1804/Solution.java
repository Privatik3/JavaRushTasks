package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buffRead.readLine();

        FileInputStream fileInput = new FileInputStream(new File(fileName));
        HashMap<Integer, Integer> bytesCount = new HashMap<>();

        int countBytes = 1;
        while (fileInput.available() > 0) {
            int currentByte = fileInput.read();
            if (bytesCount.containsKey(currentByte)) {
                int currentValue = bytesCount.get(currentByte)  + 1;
                bytesCount.put(currentByte, currentValue);
                if (countBytes > currentValue) {
                    countBytes = currentValue;
                }
            } else {
                bytesCount.put(currentByte, 1);
            }
        }

        for (Map.Entry<Integer, Integer> pair : bytesCount.entrySet() ) {
            if (pair.getValue() == countBytes)
                System.out.print(pair.getKey() + " ");
        }

        fileInput.close();
    }
}
