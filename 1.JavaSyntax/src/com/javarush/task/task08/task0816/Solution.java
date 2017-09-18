package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» — «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Bush", new Date("MAY 4 1985"));
        map.put("Ivanov", new Date("JULY 25 1978"));
        map.put("Oland", new Date("NOVEMBER 12 1991"));
        map.put("Ford", new Date("MARCH 21 2003"));
        map.put("Washington", new Date("FEBRUARY 8 1982"));
        map.put("Jeferson", new Date("SEPTEMBER 17 1999"));
        map.put("Mugabe", new Date("APRIL 4 1982"));
        map.put("Adenauer", new Date("DECEMBER 29 2007"));
        map.put("Bismark", new Date("JUNE 3 1975"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Date> pair = iter.next();
            int month = pair.getValue().getMonth();
            if ((month >= 5) && (month <= 7)) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
