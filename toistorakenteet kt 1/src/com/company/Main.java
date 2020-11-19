package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 5};
        for (int a = arr.length - 1; a >= 0; a = a - 1)
            System.out.println(arr[a]);
    }
}