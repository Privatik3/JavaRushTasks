package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = "G:/test.txt";
        Scanner scanner = null;
        FileInputStream fileInputStream = null;

        try {
            nameFile = reader.readLine();
            fileInputStream = new FileInputStream(nameFile);
            scanner = new Scanner(fileInputStream);
        }catch (Exception e){
            System.out.println(e);
        }


//        while (scanner.hasNext()){
//            System.out.print(scanner.next());
//        }

        try {
            while (fileInputStream.available() > 0){
                System.out.print((char) fileInputStream.read());
            }
            System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileInputStream.close();
            reader.close();
        }catch (Exception e){
            System.out.println(e);
        }




    }
}