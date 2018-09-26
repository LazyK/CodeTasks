package com.j2core.ice.codeinterview.findDuplicateAndMissedElement;

import java.util.Arrays;

/**
 * Created by ice on 9/27/18.
 */
public class DuplicateAndMissedElement {

    public static void findOnlyDuplicateAndMissedElement (int[] arr) {

        System.out.println("\nArray = " + Arrays.toString(arr)+"\n");

        int sumElements = 0;
        int sqrSum = 0;
        int a,b;
        int missedElement,dublicateElement;

        for (int anArr : arr) {
            sumElements += anArr;
            sqrSum += anArr * anArr;
        }

        a = (arr.length) * (arr.length + 1) / 2 - sumElements;
        b = (arr.length * (arr.length + 1) * (2*arr.length + 1) / 6 - sqrSum)/a;

        missedElement = (b+a)/2;
        dublicateElement = (b-a)/2;

        System.out.println("Missed Element " + missedElement);
        System.out.println("Duplicate Element " + dublicateElement);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{13, 8, 6, 2, 8, 14, 11, 4, 9, 10, 3, 15, 7, 12, 5};

        findOnlyDuplicateAndMissedElement(arr);
    }
}
