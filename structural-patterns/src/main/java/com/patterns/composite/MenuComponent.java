package com.patterns.composite;

import java.util.ArrayList;
import java.util.List;

abstract class MenuComponent {

    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    String getName() {
        return name;
    }

    String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }
}
