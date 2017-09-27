package com.javarush.task.task18.task1827;

/* 
CrUD для таблицы внутри файла.
Считать с консоли имя файла для операций CrUD.

Программа запускается со следующим набором параметров:
-c productName price quantity

Значения параметров:
где id — 8 символов.
productName — название товара, 30 chars (60 bytes).
price — цена, 8 символов.
quantity — количество, 4 символа.
-c — добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле.

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {

    private static ArrayList<String> rawList;
    private static int maxId;

    public static void main(String[] args) throws Exception {
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buffRead.readLine();
        rawList = new ArrayList<>();
        buffRead.close();

        BufferedReader fileBuffRead = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        while (fileBuffRead.ready()) {
            rawList.add(fileBuffRead.readLine());
        }
        fileBuffRead.close();

        maxId = 0;
        for (String line : rawList) {
            int id = Integer.parseInt(line.substring(0, 8).replaceAll(" ", ""));
            if (maxId < id)
                maxId = id;
        }

        if (args[0].equals("-c")) {
            createNewLine(args[1], args[2], args[3]);
        }

        BufferedWriter fileBuffWrite = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        for (String line : rawList ) {
            fileBuffWrite.write(line);
            fileBuffWrite.newLine();
        }
        fileBuffWrite.close();
    }

    private static void createNewLine(String name, String price, String quantity) {
        String result = "";
        String id = String.valueOf(maxId + 1);
        result = addSpace(id, 8) + addSpace(name, 30) + addSpace(price, 8) + addSpace(quantity, 4);
        rawList.add(result);
    }

    private static String addSpace(String id, int i) {
        StringBuilder result = new StringBuilder(id);
        for (int j = result.length(); j < i; j++) {
            result.append(" ");
        }

        return result.toString();
    }
}
