package net.paulgarner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> series = new ArrayList<>();

        // 1 1 2 3 5
        int x = 0;
        int y = 1;
        for (int i=0; i<=10; i++) {
            int sum = x + y;
            series.add(sum);
            x = y;
            y = sum;
        }

        series.stream().map(Math::sqrt).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
