package com.javarush.task.task36.task3614.strategy;

public interface StorageStrategy {

    boolean containsKey(Long key);

    boolean containsValue(String value);

    void put(Long key, String value);

    Long getKey(String value);

    String getValue(Long key);
}
