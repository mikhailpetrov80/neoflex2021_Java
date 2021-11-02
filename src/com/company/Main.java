package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int SIZE = scanner.nextInt();
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            for (int j = i + 1; j < SIZE; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Повторяющееся число " + array[j] + " индекс " + j + ".");
                }
            }
        }
    }
}
