package com.company;

public class Main {

    public static void main(String[] args) {
double a = 2.1;
double b = 3.4;
	System.out.println(String.format ("val: %.3f", a/b));
        System.out.println(a+ "/"+b +" is approximately" +(String.format (" %.3f", a/b)));
    }
}
