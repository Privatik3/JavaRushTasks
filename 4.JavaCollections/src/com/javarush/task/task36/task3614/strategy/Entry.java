package com.javarush.task.task36.task3614.strategy;

import java.io.Serializable;
import java.util.Objects;

public class Entry implements Serializable {

    final int hash;
    final Long key;
    String value;
    Entry next;

    public Entry(int hash, Long key, String value, Entry next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public final Long getKey()      { return key; }
    public final String getValue()  { return value; }
    public final String toString()  { return key + "=" + value; }

    public final int hashCode() {
        return Objects.hashCode(key) ^ Objects.hashCode(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entry entry = (Entry) o;

        if (!key.equals(entry.key)) return false;
        return value.equals(entry.value);
    }
}
