package net.paulgarner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String test = "Hello";

        System.out.println(test.length() + Math.PI);

        List<Integer> series = new ArrayList<>();

        // 1 1 2 3 5
        int x = 0;
        int y = 1;
        for (int z=0; z<=10; z++) {
            int sum = x + y;
            series.add(sum);
            x = y;
            y = sum;
        }

        series.stream().map(Math::sqrt).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
