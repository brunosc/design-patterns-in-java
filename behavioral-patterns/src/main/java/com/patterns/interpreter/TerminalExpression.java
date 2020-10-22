package com.patterns.interpreter;

import java.util.StringTokenizer;

class TerminalExpression implements Expression {

    private final String data;

    TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        final var st = new StringTokenizer(context);
        while (st.hasMoreTokens()) {
            final var test = st.nextToken();
            if (test.equals(data)) {
                return true;
            }
        }
        return false;
    }
}
