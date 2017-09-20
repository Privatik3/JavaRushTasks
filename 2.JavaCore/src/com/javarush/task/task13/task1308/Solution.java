package com.javarush.task.task13.task1308;

/* 
1. Создай интерфейс Person.
2. Добавь в него метод isAlive(), который проверяет, жив человек или нет.
3. Подумай, какой тип должен возвращать этот метод.
4. Создай интерфейс Presentable.
5. Унаследуй интерфейс Presentable от интерфейса Person.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public static interface Person {
        boolean isAlive();
    }

    public static interface Presentable extends Person {

    }
}