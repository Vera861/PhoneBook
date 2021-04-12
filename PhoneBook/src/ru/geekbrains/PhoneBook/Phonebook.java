package ru.geekbrains.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private HashMap<String, List<String>> surname;

    public Phonebook() {
        this.surname = new HashMap<String, List<String>>();
    }

    public void add(String s, String n) {
        List<String> number = new ArrayList<>();
        if (this.surname.containsKey(s)) {
            number = this.surname.get(s);
            number.add(n);
            this.surname.put(s, number);
        } else {
            number.add(n);
            this.surname.put(s, number);
        }
    }

    public String get(String s) {
        if (this.surname.containsKey(s))
            return (s + " телефон: " + this.surname.get(s).toString()
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "")
                    .trim());
        else return ("Фамилии '"+s+ "' нет в справочнике");
    }
}
