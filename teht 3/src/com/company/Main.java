package com.company;

public class Main {

    public static void main(String[] args) {
    Person minä = new Person ("Ben","Koreneff", 2003);
    System.out.println(minä);
    }
}
class Person
{
    public Person (String etunimi, String sukunimi, int syntymavuosi)
    {this.etunimi = etunimi;
    this.sukunimi = sukunimi;
    this.syntymavuosi = syntymavuosi;
    }

    String etunimi;
    String sukunimi;
    int syntymavuosi;
}