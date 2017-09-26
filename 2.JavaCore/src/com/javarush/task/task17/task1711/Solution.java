package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]){
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3)
                        add(args[i], args[i+1], args[i+2]);
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        update(args[i], args[i + 1], args[i + 2], args[i + 3]);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        delete(args[i]);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        info(args[i]);
                    }
                }
                break;
            default:
                synchronized (allPeople) {
                    throw new IllegalArgumentException();
                }
        }
    }

    private static void info(String arg) {
        Person person = allPeople.get(Integer.parseInt(arg));
        String name = person.getName();
        String sex = "ж";
        if(person.getSex().equals(Sex.MALE))
            sex = "м";
        Date date = person.getBirthDay();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        System.out.println(name + " " + sex + " " + dateFormat.format(date));
    }

    private static void delete(String arg) {
        int id = Integer.parseInt(arg);

        Person person = allPeople.get(id);
        person.setName(null);
        person.setSex(null);
        person.setBirthDay(null);
        allPeople.set(id, person);
    }

    private static void update(String arg, String arg1, String arg2, String arg3) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = dateFormat.parse(arg3);
        Person person = null;
        if(arg2.equals("м"))
            person = Person.createMale(arg1, date);
        else
            person = Person.createFemale(arg1, date);
        int id = Integer.parseInt(arg);
        allPeople.set(id, person);
    }

    private static void add(String arg, String arg1, String arg2) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = dateFormat.parse(arg2);
        Person person = null;
        if(arg1.equals("м")) {
            person = Person.createMale(arg, date);
        }
        else {
            person = Person.createFemale(arg, date);
        }
        allPeople.add(person);
        int id = allPeople.size()-1;
        System.out.println(id);
    }
}
