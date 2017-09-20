package com.javarush.task.task13.task1309;

/* 
1. Создай интерфейс Movable с методом speed.
2. Метод speed должен возвращать значение типа Double и не должен ничего принимать в качестве аргументов.
3. Создай и унаследуй интерфейс Flyable от интерфейса Movable.
4. Добавь в интерфейс Flyable метод speed.
5. Метод speed должен возвращать значение типа Double и принимать один параметр типа Flyable.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public static interface Movable {
        Double speed();
    }

    public static interface Flyable extends Movable {

        Double speed(Flyable flyable);
    }
}