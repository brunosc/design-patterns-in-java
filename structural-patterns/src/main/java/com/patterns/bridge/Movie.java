package com.patterns.bridge;

class Movie {
    private final String classification;
    private final String runtime;
    private final String title;
    private final String year;

    Movie(String classification, String runtime, String title, String year) {
        this.classification = classification;
        this.runtime = runtime;
        this.title = title;
        this.year = year;
    }

    String getClassification() {
        return classification;
    }

    String getRuntime() {
        return runtime;
    }

    String getTitle() {
        return title;
    }

    String getYear() {
        return year;
    }
}
