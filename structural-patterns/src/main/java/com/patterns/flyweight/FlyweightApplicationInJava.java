package com.patterns.flyweight;

class FlyweightApplicationInJava {

    public static void main(String[] args) throws Exception {
        final var firstInt = Integer.valueOf(5);
        final var secondInt = Integer.valueOf(5);
        final var thirdInt = Integer.valueOf(10);

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
    }

}
