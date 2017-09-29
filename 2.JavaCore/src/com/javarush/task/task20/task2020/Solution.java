package com.javarush.task.task20.task2020;

import java.io.*;
import java.util.logging.Logger;

/* 
Сериализуй класс Person стандартным способом. При необходимости добавь некоторым полям модификатор transient.
*/
public class Solution {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        String fullName;
        final String greetingString;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }

        @Override
        public String toString() {
            return firstName + "\t" +
                    lastName + "\t" +
                    fullName + "\t" +
                    greetingString + "\t" +
                    country + "\t" +
                    sex;
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);

        Person person = new Person("Вася", "Пупкин", "Страна", Sex.MALE);
        System.out.println(person);
        oos.writeObject(person);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);

        Person personRestore = (Person) ois.readObject();
        System.out.println(personRestore);
    }
}
