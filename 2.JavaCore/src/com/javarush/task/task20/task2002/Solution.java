package com.javarush.task.task20.task2002;


import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Реализуйте логику записи в файл и чтения из файла для класса JavaRush.
В файле your_file_name.tmp может быть несколько объектов JavaRush.
Метод main реализован только для вас и не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("Input.txt", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User e = new User();
            e.setFirstName("FirstName");
            e.setLastName("LastName");
            e.setBirthDate(new Date());
            e.setMale(true);
            e.setCountry(User.Country.RUSSIA);
            javaRush.users.add(e);
            javaRush.users.add(e);
            javaRush.save(outputStream);
            outputStream.flush();
            outputStream.close();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            outputStream.write(this.toString().getBytes());
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            byte[] buff = new byte[inputStream.available()];
            inputStream.read(buff);
            String rawLoad = new String(buff);

            String[] split = rawLoad.split("User:");

            for (String userLine : split ) {
                if (userLine.isEmpty()) continue;
                User user = new User();
                user.setFirstName(userLine.split("\t")[0]);
                user.setLastName(userLine.split("\t")[1]);
                user.setBirthDate(new Date(Long.parseLong(userLine.split("\t")[2])));
                user.setMale(Boolean.parseBoolean(userLine.split("\t")[3]));

                switch (userLine.split("\t")[4]) {
                    case "UKRAINE": user.setCountry(User.Country.UKRAINE); break;
                    case "RUSSIA": user.setCountry(User.Country.RUSSIA); break;
                    case "OTHER": user.setCountry(User.Country.OTHER); break;
                }
                users.add(user);
            }
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            for (User user : users) {
                result.append("User:");
                result
                        .append(user.getFirstName()).append("\t")
                        .append(user.getLastName()).append("\t")
                        .append(user.getBirthDate().getTime()).append("\t")
                        .append(user.isMale()).append("\t")
                        .append(user.getCountry()).append("\t");
            }

            return result.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
