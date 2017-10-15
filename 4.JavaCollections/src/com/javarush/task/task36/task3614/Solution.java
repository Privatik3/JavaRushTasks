package com.javarush.task.task36.task3614;

import com.javarush.task.task33.task3310.strategy.*;
import com.javarush.task.task36.task3614.strategy.DualHashBidiMapStorageStrategy;
import com.javarush.task.task36.task3614.strategy.StorageStrategy;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        testStrategy(new DualHashBidiMapStorageStrategy(), 1_000_000);
    }

    public static Set<Long> getIds(Shortener shortener, Set<String> strings) {
        Date currentTime = new Date();
        Set<Long> ids = new HashSet<>(strings.size());
        strings.forEach(E -> ids.add(shortener.getId(E)));
        System.out.println(new Date().getTime() - currentTime.getTime());
        return ids;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) {
        Date currentTime = new Date();
        Set<String> strings = new HashSet<>(keys.size());
        keys.forEach(E -> strings.add(shortener.getString(E)));
        System.out.println(new Date().getTime() - currentTime.getTime());
        return strings;
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber) {
        Helper.printMessage(strategy.getClass().getSimpleName());
        Set<String> generateSet = new HashSet<>();
        for (int i = 0; i < elementsNumber; i++) {
            generateSet.add(Helper.generateRandomString());
        }

        Shortener shortener = new Shortener(strategy);
        Set<Long> ids = getIds(shortener, generateSet);
        Set<String> strings = getStrings(shortener, ids);

        if (strings.containsAll(generateSet)) {
            System.out.println("Тест пройден.");
        } else {
            System.out.println("Тест не пройден.");
        }
    }
}
