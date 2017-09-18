package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));

        Cat grandPa = new Cat(buffRead.readLine(), null, null);
        Cat grandMa = new Cat(buffRead.readLine(), null, null);
        Cat papa = new Cat(buffRead.readLine(), null, grandPa);
        Cat mama = new Cat(buffRead.readLine(), grandMa, null);
        Cat son = new Cat(buffRead.readLine(), mama, papa);
        Cat daughter = new Cat(buffRead.readLine(), mama, papa);

        System.out.println(grandPa);
        System.out.println(grandMa);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat mama;
        private Cat papa;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat mama, Cat papa) {
            this.name = name;
            this.mama = mama;
            this.papa = papa;
        }

        public String toString() {
            return "Cat name is " + name + ", " +
                    (mama != null ? "mother is " + mama.name : "no mother") + ", " +
                    (papa != null ? "father is " + papa.name : "no father");
        }
    }

}
