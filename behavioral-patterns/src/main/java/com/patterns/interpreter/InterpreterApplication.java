package com.patterns.interpreter;

class InterpreterApplication {

    public static void main(String[] args) {
//        final var context = "Lions";
//        final var context = "Tigers";
//        final var context = "Bears";
//        final var context = "Lions Tigers";
        final var context = "Lions Bears";
//        final var context = "Tigers Bears";

        final var define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }

    private static Expression buildInterpreterTree() {

        Expression lions = new TerminalExpression("Lions");
        Expression tigers = new TerminalExpression("Tigers");
        Expression bears = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression tigersAndBears = new AndExpression(tigers, bears);

        // Lions or (Tigers and Bears)
        Expression lionsOrTigersAndBears = new OrExpression(lions, tigersAndBears);

        // Bears and (Lions or (Tigers and Bears))
        return new AndExpression(bears, lionsOrTigersAndBears);
    }

}
