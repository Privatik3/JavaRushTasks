package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Читайте с консоли имена файлов, пока не будет введено слово «exit«.
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String — это имя файла, параметр Integer — это искомый байт.
Закрыть потоки.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = buffRead.readLine();
            if (fileName.equals("exit")) break;
            new ReadThread(fileName).start();

        }
        buffRead.close();
    }

    public static class ReadThread extends Thread {

        String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            super.run();
            try {
                FileInputStream fileInput = new FileInputStream(new File(fileName));
                HashMap<Integer, Integer> bytesCount = new HashMap<>();

                int countBytes = 0;

                while (fileInput.available() > 0) {
                    int currentByte = fileInput.read();
                    if (bytesCount.containsKey(currentByte)) {
                        int currentValue = bytesCount.get(currentByte) + 1;
                        bytesCount.put(currentByte, currentValue);
                        if (countBytes < currentValue) {
                            countBytes = currentValue;
                        }
                    } else {
                        bytesCount.put(currentByte, 1);
                    }
                }

                for (Map.Entry<Integer, Integer> pair : bytesCount.entrySet()) {
                    synchronized (resultMap) {
                        if (pair.getValue() == countBytes) {
                            resultMap.put(fileName, pair.getKey());
                            break;
                        }
                    }
                }

                fileInput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
