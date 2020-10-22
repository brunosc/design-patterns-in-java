package com.patterns.factory;

class FactoryApplication {

    public static void main(String[] args) {
        final var blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blog.getPages());

        final var shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(shop.getPages());
    }
}
