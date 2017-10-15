package com.javarush.task.task36.task3602;

import java.util.Collections;

/* 
Найти класс по описанию
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {

        Class<?>[] declaringClass = Collections.class.getDeclaredClasses();
        for (Class clazz : declaringClass) {
            if ("EmptyList".equalsIgnoreCase(clazz.getSimpleName()))
                return clazz;
        }

        return null;
    }
}
