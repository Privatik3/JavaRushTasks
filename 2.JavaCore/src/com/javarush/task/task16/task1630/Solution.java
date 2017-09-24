package com.javarush.task.task16.task1630;

import java.io.*;

/*
1. Разберись, что делает программа.
2. В статическом блоке считай 2 имени файла firstFileName и secondFileName.
3. Внутри класса Solution создай нить public static ReadFileThread, которая реализует
интерфейс ReadFileInterface (Подумай, что больше подходит — Thread или Runnable).
3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое.
3.2. Метод getFileContent должен возвращать содержимое файла.
3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
4. Подумай, в каком месте нужно подождать окончания работы нити, чтобы обеспечить последовательный вывод файлов.
4.1. Для этого добавь вызов соответствующего метода.
 */

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = buffRead.readLine();
            secondFileName = buffRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            buffRead.close();
        } catch (IOException ignored) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();

        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {

        private String fileName;
        private String fileContent = "";

        @Override
        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public String getFileContent() {
            return fileContent;
        }

        @Override
        public void run() {
            super.run(); // В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
            try (BufferedReader buffRead = new BufferedReader(new FileReader(new File(fileName)))) {
                while (buffRead.ready()) {
                    fileContent += buffRead.readLine() + " ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
