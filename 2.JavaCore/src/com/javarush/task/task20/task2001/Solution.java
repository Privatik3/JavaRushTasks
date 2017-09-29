package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Реализуй логику записи в файл и чтения из файла для класса Human.
Поле name в классе Human не может быть пустым.
Метод main реализован только для вас и не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {

            OutputStream outputStream = new FileOutputStream("Input.txt");
            InputStream inputStream = new FileInputStream("Input.txt");

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();
            outputStream.close();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }


    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append(name);
            if (assets.size() > 0) {
                result.append("Assets:");

                for (Asset asset : assets ) {
                    result.append(asset.getName()).append("\t").append(asset.getPrice()).append("\t");
                }

            }

            return result.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            outputStream.write(this.toString().getBytes());
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            byte[] buff = new byte[inputStream.available()];
            inputStream.read(buff);
            String rawLoad = new String(buff);

            String[] split = rawLoad.split("Assets:");
            name = split[0];
            if (split.length == 1) return;


            String[] assetss = split[1].split("\t");
            for (int i = 0; i < assetss.length; i+=2) {
                Asset asset = new Asset(assetss[i]);
                asset.setPrice(Double.parseDouble(assetss[i+1]));

                assets.add(asset);
            }
        }
    }
}
