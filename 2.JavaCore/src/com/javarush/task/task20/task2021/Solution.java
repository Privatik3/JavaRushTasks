package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Запрети сериализацию класса SubSolution используя NotSerializableException.
Сигнатуры классов менять нельзя.
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {

        private void writeObject(ObjectOutputStream s) throws IOException {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {

    }
}
