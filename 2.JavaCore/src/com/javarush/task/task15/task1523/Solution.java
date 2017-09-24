package com.javarush.task.task15.task1523;

/* 
1. В классе Solution создай 4 конструктора конструктора с разными модификаторами доступа.
2. В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
3. Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
4. Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 конструктора
с различными модификаторами доступа(все кроме private).
*/

public class Solution {

    public static void main(String[] args) {

    }

    private Solution(String name) {}
    protected Solution(String name1, String name2) {}
    Solution(String name, String name1, String name2) {}
    public Solution(String name, String name1, String name2, String name3) {}
}

