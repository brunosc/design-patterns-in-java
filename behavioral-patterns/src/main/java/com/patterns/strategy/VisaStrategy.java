package com.patterns.strategy;

class VisaStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        var isValid = creditCard.getNumber().startsWith("4");

        if (isValid) {
            isValid = creditCard.getNumber().length() == 16;
        }

        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }

}
