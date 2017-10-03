package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}

Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);

        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {

        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> pair : params.entrySet() ) {
            if (!(pair.getValue() == null)) {
                if (result.length() > 0) result.append(" and ");
                result.append(String.format("%s = '%s'", pair.getKey(), pair.getValue()));
            }
        }

        return result.toString();
    }
}
