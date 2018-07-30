package ru.buyanov.hunting;

import java.util.Iterator;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;


    public IntIterable(int[] backed) {
        this.backed = backed;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {

        int index_array = 0;

        public boolean hasNext() {
            if (backed.length > index_array) {
                return true;
            } else return false;
        }

        public Integer next() {
            if (hasNext()) {
                return backed[index_array++];
            }
           else return null;
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
