package com.company;

public class Main {

    public static void main(String[] args) {
	int [] numbers = {1, 2, 3, 4, 5, 6};
	int [] array = new int [numbers.length];
	int numberInd = 0;
	for (int number : numbers) {
		array[numberInd] = number += 10;
		numberInd++;
	}
	for (int arr : array)
		System.out.print (arr + ", ");
    }
}
