package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayToCheck = {12, -2, 3, 12, -2, 1, 2, 3, 5, 2, 7, 9, 11, 0, 2, 6, 5, 22, 4, 6, 7, 8, 8, 12};
 // using ArrayList
        ArrayList<Integer> newArray = new ArrayList<>();
        ArrayList<Integer> duplicateItems = new ArrayList<>();

        for (int i: arrayToCheck) {
            if (!newArray.contains(i)) {
                newArray.add(i);
            } else {
                if (i % 2 == 0 && !duplicateItems.contains(i)) {
                    duplicateItems.add(i);
                }
            }
        }

        System.out.println("Array to check: " + Arrays.toString(arrayToCheck));
        System.out.println("Duplicate even items are: " + duplicateItems);

    // using array
        int[] array = {2,4,5,7,8,4,2,1,9,5,3,1,0,1};
        int[] ref = new int[14];

        for(int i = 0 ; i < array.length ; i++) {
            if(array[i] % 2 == 0){
                ref[array[i]]++;
            }
        }

        for(int i = 0 ; i < ref.length;i++){
            if(ref[i] > 1) {
                System.out.println(i);
            }
        }


    }
}

