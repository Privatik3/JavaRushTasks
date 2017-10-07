package com.javarush.task.task31.task3109;

import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/* 
Читаем конфиги
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {

        Properties result = new Properties();

        try {
            Path proper = Paths.get(fileName);
            if (proper.getFileName().toString().toLowerCase().endsWith("xml")) {
                result.loadFromXML(new FileInputStream(proper.toFile()));
            } else {
                result.load(new FileInputStream(proper.toFile()));
            }
        } catch (Exception ignored) {}

        return result;
    }
}
