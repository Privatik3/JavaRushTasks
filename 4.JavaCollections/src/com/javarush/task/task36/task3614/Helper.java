package com.javarush.task.task36.task3614;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;

public class Helper {

    public static String generateRandomString() {
        return new BigInteger(130, new SecureRandom()).toString(32);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
