package com.company;
import java.util.Scanner;
import java.net.URL;


class MobyDick{

    public static void main(String[] args) throws Exception {
        URL URLmb = new URL("https://www.gutenberg.org/files/2701/2701-0.txt");

        Scanner input = new Scanner(URLmb.openStream());
        int a = 0;
        while (input.hasNext() && a < 200) {
            String b =input.next();
            a++;
            if (a % 10 == 0)
                System.out.println(" " +b);
            else
                System.out.print(" " + b);
        }

    }
}
