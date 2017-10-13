package com.javarush.task.task35.task3513.female;

import com.javarush.task.task35.task3513.AbstractFactory;
import com.javarush.task.task35.task3513.Human;

public class FemaleFactory implements AbstractFactory {

    public Human getPerson(int age) {
        if (age <= KidGirl.MAX_AGE) return new KidGirl();
        if (age <= TeenGirl.MAX_AGE) return new TeenGirl();
        return new Woman();
    }
}
