package com.javarush.task.task05.task0510;

/*
— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
— вес, цвет, адрес (чужой домашний кот)
*/

public class Cat {
    //напишите тут ваш код
    String name = null, address = null, color = "Some color";
    int age = 5, weight = 6;

    public void initialize(String name) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(int weight, String color) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address) {
        this.address = address;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}
