package com.javarush.task.task35.task3509;

import java.util.*;


/* 
Реализуй вспомогательныe методы в классе Solution, которые должны
создавать соответствующую коллекцию и помещать туда переданные объекты.
Методы newArrayList, newHashSet параметризируй типом T.
Метод newHashMap параметризируй типами К(ключ) и V(значение).
Аргументы метода newHashMap должны принимать списки, в которых содержатся наследники типов K и V.
Возвращаемые коллекции должны быть такого же типа, что и переданные в метод объекты.

Подсказка: в методе newHashMap нужно проверить чтобы списки ключей и значений совпадали по размерам,
в противном случае кинь IllegalArgumentException.
*/
public class Solution {

    public static void main(String[] args) {
        Solution.<Integer, Integer>newHashMap(newArrayList(10, 10), newArrayList(10, 10));
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        //напишите тут ваш код
        ArrayList<T> res = new ArrayList<>();
        res.addAll(Arrays.asList(elements));

        return res;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        //напишите тут ваш код
        HashSet<T> res = new HashSet<>();
        res.addAll(Arrays.asList(elements));

        return res;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        //напишите тут ваш код
        if (keys.size() != values.size()) throw new IllegalArgumentException();

        HashMap<K, V> result = new HashMap<K, V>();
        for (int i = 0; i < keys.size(); i++) {
            result.put(keys.get(i), values.get(i));
        }
        return result;
    }
}
