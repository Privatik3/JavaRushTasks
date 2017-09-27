package com.javarush.task.task18.task1824;

/* 
Читайте с консоли имена файлов.
Если файла не существует (передано неправильное имя файла), то перехватить исключение FileNotFoundException,
вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки.
Не используйте System.exit();
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = null;
            try {
                fileName = buffRead.readLine();
                FileInputStream fileInputStream = new FileInputStream(new File(fileName));
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                buffRead.close();
                break;
            }
        }
    }
}
