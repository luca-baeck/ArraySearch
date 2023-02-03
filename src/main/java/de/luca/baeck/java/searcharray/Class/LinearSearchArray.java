package de.luca.baeck.java.searcharray.Class;

import de.luca.baeck.java.searcharray.AbstractClass.AbstractSearchArray;

public class LinearSearchArray<E> extends AbstractSearchArray<E> {

    @Override
    public boolean execute(E[] array, E item) {
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
    
}
