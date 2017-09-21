package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: «user«, «loser«, «coder«, «proger«.
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см. Person.java], например, для строки «user» нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Loser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true) {
            key = reader.readLine();
            //создаем объект, пункт 2
            if (key.equals("user"))
                person = new Person.User();
            else if (key.equals("loser"))
                person = new Person.Loser();
            else if (key.equals("coder"))
                person = new Person.Coder();
            else if (key.equals("proger"))
                person = new Person.Proger();
            else
                break;

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        /*3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
        3.2. Вызывает метод doNothing(), если person имеет тип Loser.
        3.3. Вызывает метод coding(), если person имеет тип Coder.
        3.4. Вызывает метод enjoy(), если person имеет тип Prog*/

        if (person instanceof Person.User)
            ((Person.User) person).live();
        else if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Coder)
            ((Person.Coder) person).coding();
        else if (person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
    }
}
