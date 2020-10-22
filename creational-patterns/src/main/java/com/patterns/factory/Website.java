package com.patterns.factory;

import java.util.ArrayList;
import java.util.List;

abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    List<Page> getPages() {
        return pages;
    }

    Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();
}
