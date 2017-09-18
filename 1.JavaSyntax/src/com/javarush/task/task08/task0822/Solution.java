package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        Collections.sort(array);
        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> result = new ArrayList<>();
        int numberCount = Integer.parseInt(buffRead.readLine());
        for (int i = 0; i < numberCount; i++) {
            int value = Integer.parseInt(buffRead.readLine());
            result.add(value);
        }
        return result;
    }
}
