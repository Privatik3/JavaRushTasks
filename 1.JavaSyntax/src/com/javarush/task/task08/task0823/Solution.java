package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //переводим строку s в char[]
        char[] charStr = s.toCharArray();
        //цикл по элементам char[]
        for(int i = 0; i < charStr.length; i++) {
            //первую букву в любом случае делаем большой
            if(i == 0) charStr[i] = Character.toUpperCase(charStr[i]);
            //i > 0 исключает выход за пределы массива при обращении [i-1]
            //плюс проверяем, чтобы предыдущий элемент являлся пробелом
            if(i > 0 && Character.isSpaceChar(charStr[i-1]))
                charStr[i] = Character.toUpperCase(charStr[i]);
        }
        //переопределяем ссылку s на новую строку, состоящую из
        //измененного массива char[]
        s = new String(charStr);
        System.out.println(s);
    }
}
