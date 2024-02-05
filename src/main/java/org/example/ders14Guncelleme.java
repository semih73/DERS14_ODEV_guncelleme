package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ders14Guncelleme {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());

        int searchValue = 3;

        List<Integer> result = updateList(numbers, searchValue);

        // Sonucu yazdır
        System.out.println(result);
    }

    public static List<Integer> updateList(List<Integer> list, int searchValue) {
        return list.stream()
                .map(number -> number == searchValue ? searchValue : -1)
                .collect(Collectors.toList());
    }
}
