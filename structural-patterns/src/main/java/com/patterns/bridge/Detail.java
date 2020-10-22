package com.patterns.bridge;

class Detail {
    private final String label;
    private final String value;

    Detail(String label, String value) {
        this.label = label;
        this.value = value;
    }

    String getLabel() {
        return label;
    }

    String getValue() {
        return value;
    }
}
