package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //«Мама», «Мыла», «Раму».
        String var1 = "Мама", var2 = "Мыла", var3 = "Раму";

        System.out.println(var1 + var2 + var3);
        System.out.println(var1 + var3 + var2);
        System.out.println(var2 + var1 + var3);
        System.out.println(var2 + var3 + var1);
        System.out.println(var3 + var1 + var2);
        System.out.println(var3 + var2 + var1);
    }
}
