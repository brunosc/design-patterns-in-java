package com.patterns.iterator;

import java.util.Iterator;

class BikeRepository implements Iterable<String> {

    private String [] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[10];
        index = 0;
    }

    void addBike(String bike) {
        if(index == bikes.length) {
            String [] largerBikes = new String[bikes.length + 5];
            System.arraycopy( bikes, 0, largerBikes, 0, bikes.length );
            bikes = largerBikes;
            largerBikes = null;
        }

        bikes[index] = bike;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

        };
    }
}
