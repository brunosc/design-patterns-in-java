package com.patterns.builder;

class LunchOrder {
    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        Builder() {}

        LunchOrder build() {
            return new LunchOrder(this);
        }

        Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }
}