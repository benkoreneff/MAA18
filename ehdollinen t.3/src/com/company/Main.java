package com.company;

public class Main {

    public static void main(String[] args) {
        String[] sanat = {"Naapuri","näytti","kovin", "iloiselta", "kun", "tapasimme"};
        for (String sana : sanat)
            if(sana.length()>=3 && sana.length() <= 6)
            System.out.println(sana);


    }
}
