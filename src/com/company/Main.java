package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] decimals = new double[15];
        for (int i = 0; i < decimals.length; i++) {
            decimals[i] = rand.nextInt(60) - 30;
        }
        System.out.println(Arrays.toString(decimals));
        int breaking = 0;
        for (int i = 0; i < decimals.length; i++) {
            if (decimals[i] < 0) {
                breaking = i;
                break;
            }
        }
        int sum = 0;
        int divider = 0;
        int average = 0;
        for (int i = breaking; i < decimals.length; i++) {
            if (0 < decimals[i]) {
                sum += decimals[i];
                divider++;
            }
        }
        average = sum / divider;
        System.out.println("Среднее арифметическое массива: " + average);
        double min = 0;
        int min_i = 0;
        int j = 0;
        double temp = 0;
        for (int i = 0; i < decimals.length; i++) {
            min = decimals[i];
            min_i = i;
            for (j = i + 1; j < decimals.length; j++) {
                if (decimals[j] < min) {
                    min = decimals[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                temp = decimals[i];
                decimals[i] = decimals[min_i];
                decimals[min_i] = temp;
            }
            System.out.println(Arrays.toString(decimals));
        }
    }
}

