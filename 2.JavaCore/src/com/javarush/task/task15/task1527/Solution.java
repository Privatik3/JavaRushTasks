package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) — для чисел (дробные числа разделяются точкой)
alert(String value) — для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String url = rd.readLine();
        String[] params = url.split("&");
        params[0] = params[0].split("\\?")[1];
        String name;
        ArrayList<String> list = new ArrayList<String>();
        for (String s : params) {
            name = s.split("=")[0];
            if (name.equals("obj")) {
                list.add(s.split("=")[1]);
                System.out.print(name + " ");
            } else {
                System.out.print(name + " ");
            }
        }
        System.out.println();

        for (String s : list) {
            try {
                double d = Double.parseDouble(s);
                alert(d);
            } catch (NumberFormatException e) {
                alert(s);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
