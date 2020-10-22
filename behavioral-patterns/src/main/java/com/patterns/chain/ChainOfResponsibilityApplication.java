package com.patterns.chain;

class ChainOfResponsibilityApplication {

    public static void main(String[] args) {
        final var director = new Director();
        final var vp = new VP();
        final var ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        var request = new Request(RequestType.CONFERENCE, 500);
        director.handleRequest(request);

        System.out.println();

        request = new Request(RequestType.PURCHASE, 1000);
        vp.handleRequest(request);

        System.out.println();

        request = new Request(RequestType.PURCHASE, 2000);
        director.handleRequest(request);
    }

}
