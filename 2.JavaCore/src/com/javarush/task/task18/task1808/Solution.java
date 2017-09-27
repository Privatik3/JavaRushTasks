package com.javarush.task.task18.task1808;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String firsFile = buffRead.readLine();
        String secondFile = buffRead.readLine();
        String thirtyFile = buffRead.readLine();

        FileInputStream firstInputStream = new FileInputStream(new File(firsFile));
        FileOutputStream secondInputStream = new FileOutputStream(new File(secondFile));
        FileOutputStream thirtyInputStream = new FileOutputStream(new File(thirtyFile));

        int halfBytes = firstInputStream.available() / 2;
        boolean even = (firstInputStream.available() % 2) == 0;


        byte[] buff = new byte[even ? halfBytes : halfBytes + 1];
        firstInputStream.read(buff);
        secondInputStream.write(buff);

        buff = new byte[halfBytes];
        firstInputStream.read(buff);
        thirtyInputStream.write(buff);

        firstInputStream.close();
        secondInputStream.close();
        thirtyInputStream.close();
    }
}
