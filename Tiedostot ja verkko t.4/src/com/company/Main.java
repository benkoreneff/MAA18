package com.company;
import java.util.Scanner;
import java.net.URL;


class PleaseCatch {

    public static void main(String[] args)
    {
        try {
            URL weirdURL = new URL("https://none.csefgh.org/none.txt");
            Scanner networkinput = new Scanner(weirdURL.openStream());
            System.out.println(networkinput.next());
        }
        catch  (Exception e) {
            System.out.println(e);
        }
    }
}
