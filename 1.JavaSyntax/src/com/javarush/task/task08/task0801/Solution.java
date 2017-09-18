package com.javarush.task.task08.task0801;

/* 
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.Collections;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> hashSet = new HashSet<>();
        Collections.addAll(hashSet,
                "арбуз", "банан", "вишня",
                "груша", "дыня", "ежевика", "жень-шень",
                "земляника", "ирис", "картофель");

        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
