package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SIZE = scanner.nextInt();
        System.out.println();

        scanner.nextLine();
        String line = scanner.nextLine();
        String[] time = line.split(",");
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = Integer.parseInt(time[i]);
        }

        System.out.println();

        Arrays.sort(array);

        int count = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            }

        }
        System.out.println(count);
    }
}
