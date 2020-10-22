package com.patterns.composite;

class CompositeApplication {

    public static void main(String[] args) {

        final var mainMenu = new Menu("Main", "/main");
        final var safetyMenuItem = new MenuItem("Safety", "/safety");

        mainMenu.add(safetyMenuItem);

        final var claimsSubMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsSubMenu);

        final var personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");

        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
    }

}
