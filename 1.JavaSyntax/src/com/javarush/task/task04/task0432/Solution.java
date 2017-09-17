package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String someString = buffRead.readLine();
        int stringCount = Integer.parseInt(buffRead.readLine());

        int i = 0;
        while(i < stringCount) {
            System.out.println(someString);
            i++;
        }

    }
}
