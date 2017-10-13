package com.javarush.task.task35.task3513.male;

import com.javarush.task.task35.task3513.AbstractFactory;
import com.javarush.task.task35.task3513.Human;

public class MaleFactory implements AbstractFactory {

    public Human getPerson(int age) {
        if (age <= KidBoy.MAX_AGE) return new KidBoy();
        if (age <= TeenBoy.MAX_AGE) return new TeenBoy();
        return new Man();
    }
}
