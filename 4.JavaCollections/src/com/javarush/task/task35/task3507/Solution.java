package com.javarush.task.task35.task3507;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

/* 
ClassLoader - что это такое?
*/
public class Solution {
    public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException {
        Set<? extends Animal> allAnimals = getAllAnimals((Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath() + Solution.class.getPackage().getName().replaceAll("[.]", "/") + "/data").substring(1));
        System.out.println(allAnimals);
    }

    public static Set<? extends Animal> getAllAnimals(String pathToAnimals) throws IOException, IllegalAccessException, InstantiationException {

        Object[] files = Files.list(Paths.get(pathToAnimals)).toArray();
        Set<Animal> result = new HashSet<>();

        for (Object file : files) {
            if (file instanceof Path) {
                Class clazz = findClass(Files.readAllBytes((Path) file));

                if (checkConditions(clazz))
                    result.add((Animal) clazz.newInstance());
            }
        }

        return result;
    }

    private static boolean checkConditions(Class clazz) {
        int score = 0;
        //find interface Animal
        Class[] interfaces = clazz.getInterfaces();
        for (Class interf : interfaces)
            if (interf.getSimpleName().equals("Animal")) {
                score++;
                break;
            }

        //Find default constuctor
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors)
            if (constructor.getParameterCount() == 0) {
                score++;
            }

        return score == 2;
    }

    public static Class findClass(byte[] fileBytes) {

        return new ClassLoader() {
            public Class load() {
                return super.defineClass(null, fileBytes, 0, fileBytes.length);
            }
        }.load();
    }
}
