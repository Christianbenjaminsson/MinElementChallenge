package com.example.minelementchallenge;

import java.util.Scanner;

public class MinElementChallenge {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter count: ");
        int count = scan.nextInt();
        scan.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("Min = " + returnedMin);


    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for (int i = 0; i < array.length; i ++) {
            System.out.print("Enter a number: \r");
            int number = scan.nextInt();
            scan.nextLine();
            array[i] = number;
        }

        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i ++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }

        return min;
    }
}
