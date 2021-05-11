package org.apache.commons;

import java.util.Comparator;

public class ItemSorters {

    static class SortByCategory implements Comparator<ShopItem> {
        @Override
        public  int compare(ShopItem o1, ShopItem o2) {
            return o1.category.compareTo(o2.category);
        }
    }
 /*   static int sortByCategory(ShopItem item1, ShopItem item2) {
        return item1.category.compareTo(item2.category);
    }*/


    static class SortByTitle implements Comparator<ShopItem>{

        @Override
        public int compare(ShopItem o1, ShopItem o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }

   /* static int sortByTitle(ShopItem item1, ShopItem item2) {
        return item1.name.compareTo(item2.name);
    }*/


    static class SortByPrice implements Comparator<ShopItem>{

        @Override
        public int compare(ShopItem o1, ShopItem o2) {
            return o1.priceToString().compareTo(o2.priceToString());
        }
    }

/* static int sortByPrice(ShopItem item1, ShopItem item2) {
        return item1.priceToString().compareTo(item2.priceToString());
    }*/


    static class SortByQuantity implements Comparator<ShopItem>{
        @Override
        public int compare(ShopItem o1, ShopItem o2) {
            return o1.quantityToString().compareTo(o2.quantityToString());
        }
    }

/*    static int sortByQuantity(ShopItem item1, ShopItem item2) {
        return item1.quantityToString().compareTo(item2.quantityToString());
    }*/



}
