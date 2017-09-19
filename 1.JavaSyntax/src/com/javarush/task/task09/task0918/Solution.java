package com.javarush.task.task09.task0918;

/* 
Есть четыре класса MyException, MyException2, MyException3, MyException4.
Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.

Подсказка:
Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends MyException2 {
    }

    static class MyException2 extends Exception {
    }

    static class MyException3 extends MyException4 {
    }

    static class MyException4 extends Error {
    }
}

