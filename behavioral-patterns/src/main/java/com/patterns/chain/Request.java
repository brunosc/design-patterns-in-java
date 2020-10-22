package com.patterns.chain;

class Request {

    private final RequestType requestType;
    private final double amount;

    Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }
}
