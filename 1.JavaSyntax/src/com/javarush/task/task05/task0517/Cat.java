package com.javarush.task.task05.task0517;

/* 
6. У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
7. У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
8. У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
9. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
10. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
*/

public class Cat {
    //напишите тут ваш код
    String name = null;
    int weight = 1;
    int age = 2;
    String color = "Black";
    String address = null;

    public Cat(String name) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
