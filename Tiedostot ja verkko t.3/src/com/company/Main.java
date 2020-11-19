package com.company;
import java.util.Scanner;
import java.net.URL;
public class Main {

    public static void main(String[] args) {
        try {
            URL sumURL = new URL ("https://git.io/JvUn5");
            Scanner input = new Scanner (sumURL.openStream());
            while (input.hasNextInt()) {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(a+b);
            }



        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
