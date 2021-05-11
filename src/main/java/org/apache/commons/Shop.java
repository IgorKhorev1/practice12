package org.apache.commons;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Shop {

    public List<ShopItem> getStartedPack(){
        ShopItem product1 = new ShopItem("Fruits", 25.0, "Apple", 15);
        ShopItem product2 = new ShopItem("TV", 11200.0, "TV-Smart", 2);
        ShopItem product3 = new ShopItem("Candies", 50.0, "Korovka", 150);
        ShopItem product4 = new ShopItem("Chocolate", 45.0, "Alenka", 80);
        ShopItem product5 = new ShopItem("Vegetables", 15.0, "Cucumber", 30);
        ShopItem product6 = new ShopItem("Bakery", 80.0, "cookies", 45);
        ShopItem product7 = new ShopItem("Fruits", 22.0, "Pear", 3);
        ShopItem product8 = new ShopItem("Fruits", 35.0, "Banana", 10);
        ShopItem product9 = new ShopItem("Vegetables", 99.0, "Tomatoes", 9);
        ShopItem product10 = new ShopItem("Vegetables", 27.0, "Onion", 12);


        List<ShopItem> shopItems = new LinkedList<>();
        shopItems.add(product1);
        shopItems.add(product2);
        shopItems.add(product3);
        shopItems.add(product4);
        shopItems.add(product5);
        shopItems.add(product6);
        shopItems.add(product7);
        shopItems.add(product8);
        shopItems.add(product9);
        shopItems.add(product10);

        return shopItems;
    }

}
