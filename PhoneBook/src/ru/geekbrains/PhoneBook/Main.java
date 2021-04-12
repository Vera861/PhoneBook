package ru.geekbrains.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Phonebook pb = new Phonebook();
        pb.add("Радулов", "+7(928)632-14-52");
        pb.add("Радулов", "+7(962)442-14-52");
        pb.add("Сорокин", "+7(988)638-98-89");
        System.out.println(pb.get("Радулов"));
        System.out.println(pb.get("Сорокин"));
        System.out.println(pb.get("Мозякин"));
//        chageList();
    }

    public static void chageList() {
        List<String> surnames = new ArrayList<>(List.of("Морозов", "Радулов", "Панарин", "Ковальчук",
                "Морозов", "Мозякин", "Дацюк", "Морозов", "Сорокин", "Кошечкин", "Радулов", "Мозякин", "Капризов",
                "Кузнецов", "Морозов"));
        Map<String, Integer> duplex = new HashMap<>();
        for (int i = 0; i < surnames.size(); i++) {
            String s = surnames.get(i);
            Integer repName = duplex.get(s);
            duplex.put(s, repName == null ? 1 : repName + 1);
        }
        System.out.println(duplex);
    }
}

