package com.javarush.task.task19.task1914;

/* 
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйтесь testString.
Верни переменной System.out первоначальный поток.

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов — нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        System.setOut(consoleStream);

        String expression = outputStream.toString();
        String[] arg = expression.split(" ");

        int res = 0;
        if (arg[1].equals("+")) {
            res = Integer.parseInt(arg[0]) + Integer.parseInt(arg[2]);
        } else if (arg[1].equals("-")) {
            res = Integer.parseInt(arg[0]) - Integer.parseInt(arg[2]);
        } else if (arg[1].equals("*")) {
            res = Integer.parseInt(arg[0]) * Integer.parseInt(arg[2]);
        }
        System.out.println(expression.replace("\r\n", "") + res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

