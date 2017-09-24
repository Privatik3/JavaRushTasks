package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
В статическом блоке инициализировать labels 5 различными парами ключ-значение.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(10.5, "Sase");
        labels.put(10.1, "Sas1e");
        labels.put(10.2, "Sase2");
        labels.put(10.3, "Sase4");
        labels.put(10.8, "Sas44");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
