package com.javarush.task.task07.task0724;

/* 
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ded1 = new Human("Vasa", true, 70);
        Human ded2 = new Human("Miha", true, 60);

        Human babka1 = new Human("Bala", false, 50);
        Human babka2 = new Human("Maha", false, 40);

        Human father = new Human("Saha", true, 30, ded1, babka1);
        Human mother = new Human("Kata", false, 20, ded2, babka2);

        Human child  = new Human("Nata", false, 10, father, mother);
        Human child2  = new Human("Tana", false, 8, father, mother);
        Human child3  = new Human("Roma", true, 6, father, mother);

        System.out.println(ded1);
        System.out.println(ded2);

        System.out.println(babka1);
        System.out.println(babka2);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(child);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















