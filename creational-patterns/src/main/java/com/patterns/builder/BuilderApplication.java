package com.patterns.builder;

class BuilderApplication {

    public static void main(String[] args) {

        final var builder = new LunchOrder.Builder();

        builder
                .bread("Wheat")
                .dressing("Mayo")
                .meat("Turkey");

        final var order = builder.build();

        System.out.println(order.getBread());
        System.out.println(order.getCondiments());
        System.out.println(order.getDressing());
        System.out.println(order.getMeat());
    }
}
