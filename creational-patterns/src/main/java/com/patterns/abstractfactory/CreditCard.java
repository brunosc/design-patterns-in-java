package com.patterns.abstractfactory;

// AbstractProduct
abstract class CreditCard {
    protected int cardNumberLength;
    protected int cscNumber;

    int getCardNumberLength() {
        return cardNumberLength;
    }

    void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    int getCscNumber() {
        return cscNumber;
    }

    void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
