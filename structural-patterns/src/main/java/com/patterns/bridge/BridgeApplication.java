package com.patterns.bridge;

class BridgeApplication {

    public static void main(String[] args) {

        final var movie = new Movie("Action", "2:15", "The Last Movie", "2020");

        Formatter printFormatter = new PrintFormatter();
        Formatter htmlFormatter = new HtmlFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        System.out.println( moviePrinter.print(printFormatter) );
        System.out.println("-x-");
        System.out.println();
        System.out.println( moviePrinter.print(htmlFormatter) );

    }

}
