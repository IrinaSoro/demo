package org.example;

import org.example.services.Xxx;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        Xxx xxx = new Xxx();

        for (Integer x : Arrays.asList(2, 4, 9, 10, 12, 13)) {
            xxx.print(x);

        }
    }


}
