package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
В методе fillInPropertiesMap считайте имя файла с консоли и заполни карту properties данными из файла.
Про .properties почитать тут — http://ru.wikipedia.org/wiki/.properties
Реализуй логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String name = buffRead.readLine();
        buffRead.close();

        FileInputStream input = new FileInputStream(name);
        load(input);

        input.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();

        for (Map.Entry<String, String> pair : properties.entrySet() ) {
            prop.setProperty(pair.getKey(), pair.getValue());
        }

        prop.store(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        prop.load(inputStream);
        properties.clear();

        for (Map.Entry pair : prop.entrySet() ) {
            properties.put((String)pair.getKey(), (String)pair.getValue());
        }
    }

    public static void main(String[] args) {

    }
}
