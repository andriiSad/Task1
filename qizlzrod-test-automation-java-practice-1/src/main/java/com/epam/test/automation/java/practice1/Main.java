package com.epam.test.automation.java.practice1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {

    private Main() {
    }

    public static int task1(int n) {
        if (n > 0) return n * n;
        else if (n < 0) return -n;
        else return n;
    }

    public static int task2(int number) {
        if (number < 100 || number > 999) throw new UnsupportedOperationException();
        List<String> numbers = Arrays.asList(String.valueOf(number).split(""));
        Collections.sort(numbers);
        int k = 0;
        for (int i = 0; i < numbers.size(); i++) {
            k += parseInt(numbers.get(i)) * Math.pow(10, i);
        }
        return k;
    }

}
