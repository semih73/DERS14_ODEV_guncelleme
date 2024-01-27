package org.example;

import java.util.Arrays;
import java.util.List;

public class Stream_koleksiyon {
    public static void main(String[] args) {
        List<Integer> sayilar = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        sayilar.stream()
                .map(num -> num == 3 ? 3 : -1)
                .forEach(System.out::println);
        System.out.println("aranmayan sayi yerine -1 yazıldı: ");
    }
}
