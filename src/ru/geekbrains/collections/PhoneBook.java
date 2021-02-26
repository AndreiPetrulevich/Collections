package ru.geekbrains.collections;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<String>> contactList = new HashMap();

    public void add(String name, String phone) {
        HashSet<String> numbers = contactList.getOrDefault(name, new HashSet());
        numbers.add(phone);
        contactList.put(name, numbers);
    }

    public HashSet<String> get(String name) {
        return contactList.getOrDefault(name, new HashSet());
    }
}
