package com.javarush.task.task22.task2211;

import java.io.*;

/* 
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        String firsName = args[0];
        String secondName = args[1];

        FileInputStream inFileBuff = new FileInputStream(firsName);
        FileOutputStream outFileBuff = new FileOutputStream(secondName);

        byte[] inBuff = new byte[inFileBuff.available()];
        inFileBuff.read(inBuff);
        String inString = new String(inBuff, "UTF-8");
        byte[] ouBuff = inString.getBytes("Windows-1251");
        outFileBuff.write(ouBuff);

        inFileBuff.close();
        outFileBuff.close();
    }
}
