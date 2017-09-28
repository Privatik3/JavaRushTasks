package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
В классе адаптере создать приватное финальное поле Scanner fileScanner.
Поле инициализировать в конструкторе с одним аргументом типа Scanner.

Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950
Петров Петр Петрович 31 12 1957

В файле хранится большое количество людей, данные одного человека находятся в одной строке.
Метод read() должен читать данные только одного человека.
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
        String name = "Иванов Иван Иванович 13 09 1993";

        PersonScannerAdapter adapter = new PersonScannerAdapter(new Scanner(name));

        System.out.println(adapter.read());
    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String[] rawDate = fileScanner.nextLine().split(" ");
            Person result = new Person(rawDate[1], rawDate[2], rawDate[0],
                    new SimpleDateFormat("dd-MM-yyyy").parse(
                            String.format("%s-%s-%s", rawDate[3], rawDate[4], rawDate[5])));

            return result;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
