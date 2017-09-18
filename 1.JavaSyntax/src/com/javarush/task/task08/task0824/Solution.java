package com.javarush.task.task08.task0824;

/* 
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human("Babuin",true,8,new ArrayList<Human>());
        Human son2 = new Human("Monkey",true,7,new ArrayList<Human>());
        Human daughter = new Human("Jiraf",false,11,new ArrayList<Human>());
        ArrayList<Human> childrens = new ArrayList<>();
        childrens.add(son1);
        childrens.add(son2);
        childrens.add(daughter);

        Human father = new Human("Gena",true,35,childrens);
        Human mother = new Human("Lena",false,30,childrens);
        ArrayList<Human> parents1 = new ArrayList<Human>();
        ArrayList<Human> parents2 = new ArrayList<Human>();
        parents1.add(father);
        parents2.add(mother);

        Human GrandPa1 = new Human("Alexey",true, 80,parents1);
        Human GrandMa1 = new Human("Zinaida",false,79,parents1);

        Human GrandPa2 = new Human("Oleg",true,81,parents2);
        Human GrandMa2 = new Human("Marina",false, 78,parents2);
        System.out.println(GrandPa1);
        System.out.println(GrandMa1);
        System.out.println(GrandPa2);
        System.out.println(GrandMa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
