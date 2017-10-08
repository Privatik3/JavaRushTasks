package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {

        ByteArrayOutputStream result = new ByteArrayOutputStream();

        for (int i = 0; i < 8; i++) {
            result.write(rnd(0,1) == 1 ? getLetter() : getNumber());
        }

        return result;
    }

    private static byte getLetter() {
        if (rnd(0,1) == 1) {
            return (byte) rnd(97, 122);
        } else {
            return (byte) rnd(65, 90);
        }
    }

    private static byte getNumber() {
        return (byte) rnd(48, 57);
    }

    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}