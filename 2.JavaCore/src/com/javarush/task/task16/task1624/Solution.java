package com.javarush.task.task16.task1624;

/* 
1. Разберись, что делает программа.
2. Сделай так, чтоб программа сначала выводила результат нити, а когда нить завершится — продолжила метод main.
*/

public class Solution {
    public static MyThread t = new MyThread();
    static String message = "inside main ";

    public static void main(String a[]) throws Exception {
        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            sleep();
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    static class MyThread extends Thread {
        String message = "inside MyThread ";

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(message + i);
                Solution.sleep();
            }
        }
    }
}