package de.luca.baeck.java.searcharray;

import de.luca.baeck.java.searcharray.Class.BinarySearchArrayIterative;
import de.luca.baeck.java.searcharray.Class.BinarySearchArrayRecursive;
import de.luca.baeck.java.searcharray.Class.LinearSearchArray;
import de.luca.baeck.java.searcharray.Interface.SearchArray;


public class AppTest {

    public static void main(String[] args) {

        Integer[] arrayI = new Integer[50];

        for(int i = 0; i < arrayI.length; i++) {
            arrayI[i] = i;
        }

        SearchArray<Integer> saLinear = new LinearSearchArray<>();
        SearchArray<Integer> saBinaryR = new BinarySearchArrayRecursive<>();
        SearchArray<Integer> saBinaryI = new BinarySearchArrayIterative<>();

        int search = 49;

        System.out.println("Linear Search: (" + search + ") Result: " + saLinear.execute(arrayI, search));
        System.out.println("Bfinary Search Recursive: (" + search + ") Result: " + saBinaryR.execute(arrayI, search));
        System.out.println("Bfinary Search Iterative: (" + search + ") Result: " + saBinaryI.execute(arrayI, search));

    }
}

