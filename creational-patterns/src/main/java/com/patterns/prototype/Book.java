package com.patterns.prototype;

class Book extends Item {
    private int numberOfPages;

    int getNumberOfPages() {
        return numberOfPages;
    }

    void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
