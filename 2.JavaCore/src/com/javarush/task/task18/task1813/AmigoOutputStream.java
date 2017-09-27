package com.javarush.task.task18.task1813;

import java.io.*;

/* 
1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используй наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 Вызвать метод flush().
2.2 Дописать следующий текст «JavaRush © All rights reserved.«, используй метод getBytes().
2.3 Закрыть поток методом close().
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream component;

    public AmigoOutputStream(String name) throws FileNotFoundException {
        super(name);
    }

    public AmigoOutputStream(String name, boolean append) throws FileNotFoundException {
        super(name, append);
    }

    public AmigoOutputStream(File file) throws FileNotFoundException {
        super(file);
    }

    public AmigoOutputStream(File file, boolean append) throws FileNotFoundException {
        super(file, append);
    }

    public AmigoOutputStream(FileDescriptor fdObj) {
        super(fdObj);
    }

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws IOException {
        super(fileOutputStream.getFD());
        this.component = fileOutputStream;
    }

    @Override
    public void close() throws IOException {
        component.flush();
        component.write("JavaRush © All rights reserved.".getBytes());
        component.close();
    }

    @Override
    public void write(int b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        component.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        component.flush();
    }

    public static void main(String[] args) throws IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
