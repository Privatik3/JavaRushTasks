package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* 
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла — в allLines, из второго — в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки,
которые есть в forRemoveLines
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader buffRead = null;
        try {
            buffRead = new BufferedReader(new InputStreamReader(System.in));
            String firstFile = buffRead.readLine();
            String secondFile = buffRead.readLine();

            BufferedReader fileReader = new BufferedReader(new FileReader(new File(firstFile)));
            while (fileReader.ready()) {
                allLines.add(fileReader.readLine());
            }
            fileReader.close();

            fileReader = new BufferedReader(new FileReader(new File(secondFile)));
            while (fileReader.ready()) {
                forRemoveLines.add(fileReader.readLine());
            }
            fileReader.close();

            new Solution().joinData();
        } catch (IOException ignored) {}
        finally {
            try { buffRead.close();}
            catch (IOException ignored) {}
        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
