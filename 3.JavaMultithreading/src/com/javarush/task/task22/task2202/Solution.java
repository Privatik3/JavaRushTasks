package com.javarush.task.task22.task2202;

/* 
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.

Пример:
«JavaRush — лучший сервис обучения Java.»

Результат:
«— лучший сервис обучения»

На некорректные данные бросить исключение TooShortStringException (сделать исключением).
*/
public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {

        if (string == null){
            throw new TooShortStringException();
        }

        String[] words = string.split(" ");
        if (words.length < 5) throw new TooShortStringException();
        return  words[1]+" "+words[2]+" "+words[3]+" "+words[4];
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
