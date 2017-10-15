package com.javarush.task.task36.task3610;

import java.io.Serializable;
import java.util.*;

public class MyMultiMap<K, V> extends HashMap<K, V> implements Cloneable, Serializable {
    static final long serialVersionUID = 123456789L;
    private HashMap<K, List<V>> map;
    private int repeatCount;

    public MyMultiMap(int repeatCount) {
        this.repeatCount = repeatCount;
        map = new HashMap<>();
    }

    @Override
    public int size() {
        //напишите тут ваш код
        int size = 0;
        for (Map.Entry<K, List<V>> pair : map.entrySet()) {
            size += pair.getValue().size();
        }
        return size;
    }

    @Override
    public V remove(Object key) {
        V deleteValue = null;

        if (map.containsKey(key)) {
            List<V> values = map.get(key);
            if (values.size() > 0) {
                deleteValue = values.get(0);
                values.remove(0);
                map.put((K) key, values);
            } else {
                map.remove(key);
            }
        }

        return deleteValue;
    }

    @Override
    public V put(K key, V value) {
        V previousValue = null;
        if (map.containsKey(key)) {
            ArrayList<V> values = new ArrayList<>(map.get(key));
            previousValue = values.get(values.size() - 1);

            if (values.size() == repeatCount) values.remove(0);

            values.add(value);
            map.put(key, values);
        } else {
            ArrayList<V> values = new ArrayList<>();
            values.add(value);
            map.put(key, values);
        }

        return previousValue;
    }

    @Override
    public Set<K> keySet() {
        //напишите тут ваш код
        return map.keySet();
    }

    @Override
    public Collection<V> values() {
        //напишите тут ваш код
        ArrayList<V> result = new ArrayList<>();
        map.values().forEach(result::addAll);
        return result;
    }

    @Override
    public boolean containsKey(Object key) {
        //напишите тут ваш код
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        //напишите тут ваш код
        final boolean[] result = {false};
        map.values().forEach(E -> {
            if (E.contains(value)) result[0] = true;
        });
        return result[0];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            for (V v : entry.getValue()) {
                sb.append(v);
                sb.append(", ");
            }
        }
        String substring = sb.substring(0, sb.length() - 2);
        return substring + "}";
    }
}