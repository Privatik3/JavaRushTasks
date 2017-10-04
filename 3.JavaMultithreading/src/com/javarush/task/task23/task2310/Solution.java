package com.javarush.task.task23.task2310;

/* 
Метод printName должен выводить свое собственное имя, т.е. «sout»
Сделайте минимум изменений.
*/
public class Solution {
    private String name;

    Solution(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    private void sout() {
        new Solution("sout") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Solution("main").sout();
    }
}
