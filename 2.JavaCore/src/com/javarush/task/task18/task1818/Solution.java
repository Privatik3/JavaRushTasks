package com.javarush.task.task18.task1818;

/* 
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String firsFile = buffRead.readLine();
        String secondFile = buffRead.readLine();
        String thirtyFile = buffRead.readLine();

        FileOutputStream firstFileOutput = new FileOutputStream(firsFile, true);
        FileInputStream secondInputStream = new FileInputStream(new File(secondFile));
        FileInputStream thirtyInputStream = new FileInputStream(new File(thirtyFile));


        byte[] buff = new byte[secondInputStream.available()];
        secondInputStream.read(buff);
        firstFileOutput.write(buff);

        buff = new byte[thirtyInputStream.available()];
        thirtyInputStream.read(buff);
        firstFileOutput.write(buff);

        firstFileOutput.close();
        secondInputStream.close();
        thirtyInputStream.close();
    }
}
