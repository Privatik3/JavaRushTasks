package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» — «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Stallone", "Piter");
        map.put("Bush", "Jhon");
        map.put("Ivanov", "Maikl");
        map.put("Oland", "Vadim");
        map.put("Ford", "Jordan");
        map.put("Washington", "Maikl");
        map.put("Jeferson", "Piter");
        map.put("Mugabe", "Mngo");
        map.put("Adenauer", "Wiliam");
        map.put("Dred", "Maikl");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> temp = new HashMap<>(map);

        int dublicateCount = 0;
        for (Map.Entry<String, String> pair : temp.entrySet()) {
            for (Map.Entry<String, String> entryPair : temp.entrySet()) {
                if (pair.getValue().equals(entryPair.getValue()))
                    dublicateCount++;

                if (dublicateCount > 1) {
                    removeItemFromMapByValue(map, pair.getValue());
                    break;
                }
            }
            dublicateCount = 0;
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}
