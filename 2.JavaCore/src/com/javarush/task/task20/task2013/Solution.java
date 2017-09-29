package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.List;

/* 
Класс Person должен сериализовываться с помощью интерфейса Externalizable.
Исправь ошибку сериализации.
Сигнатуры методов менять нельзя.
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;


        public Person() {
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(mother);
            out.writeObject(father);
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = in.readLine();
            lastName = in.readLine();
            father = (Person)in.readObject();
            mother = (Person)in.readObject();
            age = in.readInt();
            children = (List<Person>)in.readObject();
        }
    }

    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("Input.txt");


        ObjectOutputStream ob = new ObjectOutputStream(out);
        ob.writeObject(new Person("Вася", "Пупкин", 10));

        out.close();
        ob.close();
    }
}
