package com.patterns.bridge;

import java.util.List;

class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        final var builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");

        for (Detail detail : details) {
            builder.append(detail.getLabel());
            builder.append(":");
            builder.append(detail.getValue());
            builder.append("\n");
        }

        return builder.toString();
    }
}
