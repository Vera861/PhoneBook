package ru.geekbrains.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> surnames = List.of("Морозов", "Радулов", "Панарин", "Ковальчук", "Морозов", "Мозякин",
                "Дацюк", "Сорокин", "Кошечкин", "Радулов", "Капризов", "Кузнецов","Морозов");
        Map<String, Integer> duplex = new HashMap<>();
        Integer b = null;
        for (String s: surnames) {
            duplex.compute(s, b+1);
        }


    }
}
