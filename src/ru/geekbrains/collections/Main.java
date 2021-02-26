package ru.geekbrains.collections;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> catsNamesWithDuplicates = Arrays.asList("Barsik", "Murzik", "Pushok", "Lopushok", "Lol", "Kek", "Ceburek", "Pushok", "Lopushok", "Pushok");
        Set<String> catsNamesWithoutDuplicates = new HashSet(catsNamesWithDuplicates);
        System.out.println("The list of unique cat names consist of: " + catsNamesWithoutDuplicates);
        HashMap<String, Integer> duplicates = new HashMap();

        for (String catName : catsNamesWithDuplicates) {
            int countDuplicates = duplicates.getOrDefault(catName, 0);
            duplicates.put(catName, countDuplicates + 1);
        }

        PhoneBook book = new PhoneBook();
        book.add("Barsik", "7999999999");
        book.add("Barsik", "7999999999");
        book.add("Barsik", "7999999998");
        book.add("Lol", "7999999998");
        book.add("Kek", "7999999998");
        for (String name : catsNamesWithDuplicates) {
            System.out.println(name + ": " + book.get(name).toString());
        }
    }
}