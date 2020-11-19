package com.company;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        try (Scanner is = new Scanner(new File("data/dialogi.txt"))) {
           while (is.hasNextLine())
            System.out.println(is.nextLine().length());
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);

        }
    }}
