package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {

        ArrayList<String> result = new ArrayList<>();
        Stack<File> stack = new Stack<>();
        stack.push(new File(root));

        while (!stack.isEmpty()) {
            File[] files = stack.pop().listFiles();
            if (files == null) continue;

            for (File file : files) {
                if (file.isDirectory()) {
                    stack.push(file.getAbsoluteFile());
                } else {
                    //System.out.println(file.getAbsolutePath());
                    result.add(file.getAbsolutePath());
                }
            }
        }

        return result;

    }

    public static void listf(String directoryName) {
        File directory = new File(directoryName);

        // get all the files from a directory
        File[] fList = directory.listFiles();
        if (fList == null) return;
        for (File file : fList) {
            if (file.isFile()) {
                //files.add(file);
            } else if (file.isDirectory()) {
                listf(file.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 37801 - stack
        Date startTime = new Date();

        listf("C:\\");

        Date endTime = new Date();
        System.out.print(endTime.getTime() - startTime.getTime());
    }
}
