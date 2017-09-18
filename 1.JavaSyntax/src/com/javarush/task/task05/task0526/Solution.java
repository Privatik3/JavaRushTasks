package com.javarush.task.task05.task0526;

/* 
5. Объекты выведи на экран в таком формате «name + » » + age + » « + address».
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Vaska", 17, "piter");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        Man man2 = new Man("Vlad", 18, "kharkiv");
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        Woman woman1 = new Woman("Janna", 19, "moskov");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        Woman woman2 = new Woman("Vika", 20, "konotop");
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
