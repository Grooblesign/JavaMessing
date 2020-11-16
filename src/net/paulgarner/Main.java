package net.paulgarner;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> series = new ArrayList<>();
        series.add(1);
        series.add(1);

        // 1 1 2 3 5
        while (series.size() < 12) {
            series.add(series.get(series.size() - 1) + series.get(series.size() - 2));
        }

        series.forEach(i -> System.out.print(i + " "));
    }
}
