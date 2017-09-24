package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
1. Найти пример реализации паттерна Singleton с ленивой реализацией(lazy initialization).
Используй свой любимый поисковик(например google).
2. По образу и подобию в отдельных файлах создай три класса синглтона Sun, Moon, Earth.
3. Реализуй интерфейс Planet в классах Sun, Moon, Earth.
4. В статическом блоке класса Solution вызови метод readKeyFromConsoleAndInitPlanet.
5. Реализуй функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считай один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet,
создай соответствующий объект и присвой его Planet thePlanet, иначе обнулить Planet thePlanet.
*/

public class Solution {

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException ignored) {
        }
    }

    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String line = buffRead.readLine();

        if (line.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        } else if (line.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else if (line.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else {
            thePlanet = null;
        }

    }
}
