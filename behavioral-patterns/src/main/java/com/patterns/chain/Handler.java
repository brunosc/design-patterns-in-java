package com.patterns.chain;

abstract class Handler {

    protected Handler successor;

    void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract void handleRequest(Request request);
}
