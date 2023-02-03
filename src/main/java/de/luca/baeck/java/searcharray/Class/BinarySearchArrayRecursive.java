package de.luca.baeck.java.searcharray.Class;

import de.luca.baeck.java.searcharray.AbstractClass.AbstractSearchArray;

public class BinarySearchArrayRecursive<E extends Comparable<E>> extends AbstractSearchArray<E> {

    @Override
    public boolean execute(E[] array, E item) {
        return execute(array, item, 0, array.length-1);
    }

    private boolean execute(E[] array, E item, int lowerBound, int upperBound) {
        int divideIndex = lowerBound + (int)((upperBound-lowerBound) / 2);
        int resultCompare = array[divideIndex].compareTo(item);
        if(resultCompare == 0) {
            return true;
        }else if((upperBound - lowerBound) == 0) {
            return false;
        }else if(resultCompare > 0) {
            return execute(array, item, lowerBound, divideIndex-1);
        }else {
            return execute(array, item, divideIndex+1, upperBound);
        }
    }

    
}
