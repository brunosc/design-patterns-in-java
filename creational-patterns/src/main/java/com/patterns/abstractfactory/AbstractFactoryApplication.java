package com.patterns.abstractfactory;

class AbstractFactoryApplication {

    public static void main(String[] args) {
        var abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        final var card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card2.getClass());
    }
}
