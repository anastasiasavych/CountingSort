package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void sort(int arr[]) {
        int n = arr.length;
        int output[] = new int[n];
        int count[] = new int[11];
        for (int i = 0; i < count.length; ++i)
            count[i] = 0;
        for (int i=0;i<n;++i)
            ++count[arr[i]];
        System.out.println("Значення повторюваності елементів у масиві: ");
        for (int i=0;i<n;++i)
            System.out.print(count[i] + " ");
        System.out.println();

        for (int i=1;i<=10;++i) count[i] += count[i - 1];
        System.out.println("Значення суми count[i] та count[i-1]: ");
        for (int i=0;i<n;++i)
            System.out.print(count[i] + " ");
        System.out.println();

        for (int i=0;i<n;++i){
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }
        for (int i=0;i<n;++i)
            arr[i] = output[i];
    }

    public static void main(String[] args) {

        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введіть '" + (i + 1) + "' число масиву:");
            int n = in.nextInt();
            arr[i] = n;}
        System.out.println(Arrays.toString(arr)); sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    }

