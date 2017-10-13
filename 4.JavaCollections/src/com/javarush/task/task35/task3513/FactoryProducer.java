package com.javarush.task.task35.task3513;

import com.javarush.task.task35.task3513.female.FemaleFactory;
import com.javarush.task.task35.task3513.male.MaleFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(HumanFactoryType factoryType) {
        if (factoryType == HumanFactoryType.MALE) return new MaleFactory();
        else if (factoryType == HumanFactoryType.FEMALE) return new FemaleFactory();

        return null;
    }

    public static enum HumanFactoryType {
        MALE, FEMALE
    }
}
