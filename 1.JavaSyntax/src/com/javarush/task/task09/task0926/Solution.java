package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> result = new ArrayList<>();
        result.add(new int[] {1, 1, 1, 1, 1});
        result.add(new int[] {1, 1});
        result.add(new int[] {1, 1, 1, 1});
        result.add(new int[] {1, 1, 1, 1, 1, 1, 1});
        result.add(new int[] {});

        return result;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
