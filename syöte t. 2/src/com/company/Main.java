package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
        int b = 0;
        System.out.println("Input values: ");
      while (input.hasNextBoolean())
      {

          if (input.nextBoolean() == true)
              b = b +1;

      }
        System.out.println(" Total amount of True values: "+ b);



    }
}
