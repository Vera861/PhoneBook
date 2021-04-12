package ru.geekbrains.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> surnames = new ArrayList<>(List.of("Морозов", "Радулов", "Панарин", "Ковальчук",
                "Морозов", "Мозякин", "Дацюк", "Морозов", "Сорокин", "Кошечкин", "Радулов", "Мозякин", "Капризов",
                "Кузнецов", "Морозов"));
        Map<String, Integer> duplex = new HashMap<>();
//        for (String s : surnames) {
        for (int i = 0; i < surnames.size(); i++) {
            String s = surnames.get(i);
            Integer repName = duplex.get(s);
            duplex.put(s, repName == null ? 1 : repName + 1);
        }
//        }
        System.out.println(duplex);
    }
}
