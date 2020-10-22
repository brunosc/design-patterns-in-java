package com.patterns.bridge;

import java.util.ArrayList;
import java.util.List;

class MoviePrinter extends Printer {

    private final Movie movie;

    MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected List<Detail> getDetails() {
        final var details = new ArrayList<Detail>();

        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("Runtime", movie.getRuntime()));

        return details;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }
}
