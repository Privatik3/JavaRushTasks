package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Адаптировать Customer и Contact к RowItem.
Классом-адаптером является DataAdapter.

Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        Contact contact = new Contact() {
            @Override
            public String getName() {
                return "Ivanov, Ivan";
            }

            @Override
            public String getPhoneNumber() {
                return "+38(050)123-45-67";
            }
        };
        Customer customer = new Customer() {
            @Override
            public String getCompanyName() {
                return "JavaRush Ltd.";
            }

            @Override
            public String getCountryName() {
                return "Ukraine";
            }
        };
        RowItem rowItem = new DataAdapter(customer,contact);
        System.out.println(rowItem.getContactFirstName());
        System.out.println(rowItem.getContactLastName());
    }

    public static class DataAdapter implements RowItem {

        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            for (Map.Entry<String, String> country : countries.entrySet() ) {
                if (customer.getCountryName().equals(country.getValue()))
                    return country.getKey();
            }
            return null;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        //example Ivanov, Ivan
        @Override
        public String getContactFirstName() {
            String[] s = contact.getName().split(", ");
            return s[1];
        }

        @Override
        public String getContactLastName() {
            String[] s = contact.getName().split(", ");
            return s[0];
        }

        @Override
        public String getDialString() {
            return "callto://" +  contact.getPhoneNumber().replaceAll("[()-]", "");
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}