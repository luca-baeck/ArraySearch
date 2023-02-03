package de.luca.baeck.java.searcharray.Class;

import de.luca.baeck.java.searcharray.AbstractClass.AbstractSearchArray;

public class BinarySearchArrayIterative<E extends Comparable<E>> extends AbstractSearchArray<E> {

    @Override
    public boolean execute(E[] array, E item) {
        int lowerBound = 0;
        int upperBound = array.length-1;

        while((upperBound - lowerBound) > 0) {
            int divideIndex = lowerBound + (int)((upperBound-lowerBound) / 2);
            int resultCompare = array[divideIndex].compareTo(item);
            if(resultCompare == 0) {
                return true;
            }else if((upperBound - lowerBound) == 0) {
                return false;
            }else if(resultCompare > 0) {
                upperBound = divideIndex - 1;
            }else {
                lowerBound = divideIndex + 1;
            }
        }
        return array[lowerBound].equals(item);
    }
    
}
