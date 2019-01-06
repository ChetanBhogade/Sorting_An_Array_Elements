package com.chetanbhogade;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Hello World!!!");

        int[] myIntArray = getArray(5);
        int[] sort = sortArray(myIntArray);
        printArray(sort);

    }

    public static int[] getArray(int num) {
        System.out.println("Enter the " + num + " integer values : ");
        int[] value = new int[num];
        for (int i=0; i<value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i=0; i<array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i<sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        System.out.println("The Values of the array is : - ");
        for (int i=0; i<array.length; i++) {
            System.out.println("Position " + i + "th value is = " + array[i]);
        }

    }


}
