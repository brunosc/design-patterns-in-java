package com.patterns.abstractfactory;

class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
