package org.apache.commons;

import java.util.*;


public class App {
    public static void main(String[] args) {
        Shop shop = new Shop();
        List<ShopItem> shopItems = shop.getStartedPack();

        Collections.sort(shopItems, new ItemSorters.SortByCategory());
        System.out.println(shopItems.toString());
        System.out.println("-----------------");
        Collections.sort(shopItems, new ItemSorters.SortByPrice());
        System.out.println(shopItems.toString());
        System.out.println("-----------------");
        Collections.sort(shopItems, new ItemSorters.SortByTitle());
        System.out.println(shopItems.toString());
        System.out.println("-----------------");
        Collections.sort(shopItems, new ItemSorters.SortByQuantity());
        System.out.println(shopItems.toString());


    }

    public interface Compare {
        int sorted(ShopItem item1, ShopItem item2);
    }
}
