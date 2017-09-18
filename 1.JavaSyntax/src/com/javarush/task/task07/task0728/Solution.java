package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код


        for (int i = 0; i < array.length; i++) { //пробегаемся по массиву
            for (int k = 0; k < array.length - 1; k++) { // берем конкретный элемент
                if (array[k] < array[k + 1]) { //сравниваем с элементом справа
                    int temp = array[k]; // если он больше, то меняем местами
                    array[k] = array[k + 1];
                    array[k + 1] = temp;  } } }
    }
}
