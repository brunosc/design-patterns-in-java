package com.patterns.iterator;

class IteratorApplication {

    public static void main(String[] args) {
        final var repo = new BikeRepository();

        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        final var bikeIterator = repo.iterator();

        //while(bikeIterator.hasNext()) {
        //	System.out.println(bikeIterator.next());
        //}

        for (String bike : repo) {
            System.out.println(bike);
        }
    }

}
