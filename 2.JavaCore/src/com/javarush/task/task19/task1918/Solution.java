package com.javarush.task.task19.task1918;

/* 
Считайте с консоли имя файла, который имеет HTML-формат.

Пример:
Info about Leela <span xml:lang=»en» lang=»en»><b><span>Turanga Leela
</span></b></span><span>Super</span><span>girl</span>

Первым параметром в метод main приходит тег. Например, «span«.
Вывести на консоль все теги, которые соответствуют заданному тегу.
Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле.
Количество пробелов, n, r не влияют на результат.
Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нет.
Тег может содержать вложенные теги.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buffRead.readLine();
        buffRead.close();

        BufferedReader buffFile = new BufferedReader(new FileReader(fileName));
        StringBuilder fullBody = new StringBuilder();
        while (buffFile.ready()) {
            fullBody.append(buffFile.readLine());
        }
        buffFile.close();

        int deep = 0;
        String[] cutHtml = fullBody.toString().split("<" + args[0]);
        for (int i = 1; i < cutHtml.length; i++) {

            String html = "<" + args[0] + cutHtml[i];
            int endTag = parseEndTag(args[0], html, deep > 0);
            if (endTag == -1) {
                deep++;
            } else {
                if (deep == 1) {
                    System.out.print("<" + args[0] + cutHtml[i-1]);
                    i--;
                    deep = 0;
                }

                System.out.println(html.substring(0, endTag));
            }

        }

    }

    private static int parseEndTag(String tag, String html, boolean deep) {
        if (!html.contains("</" + tag)) return -1;
        if (deep) {
            return html.lastIndexOf("</" + tag) + tag.length() + 3;
        } else {
            return html.indexOf("</" + tag) + tag.length() + 3;
        }
    }
}
