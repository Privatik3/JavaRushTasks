package com.javarush.task.task31.task3105;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Добавление файла в архив
*/
public class Solution {

    static HashMap<ZipEntry, byte[]> zipEntries = new HashMap<>();

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get(args[0]);
        Path zipPath = Paths.get(args[1]);

        getZipEntries(new ZipInputStream(new FileInputStream(zipPath.toFile())));
        ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipPath.toFile()));

        zipOut.putNextEntry(new ZipEntry("new/" + filePath.getFileName().toString()));
        Files.copy(filePath, zipOut);

        for (Map.Entry<ZipEntry, byte[]> entry : zipEntries.entrySet()) {
            zipOut.putNextEntry(entry.getKey());
            zipOut.write(entry.getValue());
        }

        zipOut.close();
    }

    private static void getZipEntries(ZipInputStream zipIn) throws IOException {
        ZipEntry nextEntry;
        while ((nextEntry = zipIn.getNextEntry()) != null) {
            byte[] buff = new byte[(int) nextEntry.getSize()];
            zipIn.read(buff);
            zipEntries.put(nextEntry, buff);
        }
        zipIn.close();
    }
}
