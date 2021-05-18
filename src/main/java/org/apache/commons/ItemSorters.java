package org.apache.commons;

import java.util.Comparator;
import org.apache.log4j.Logger;

public class ItemSorters {
static  final Logger log = Logger.getLogger(ItemSorters.class);


   //  static final Logger log = Logger.getLogger(String.valueOf(ItemSorters.class));


    static class SortByCategory implements Comparator<ShopItem> {

        @Override
        public  int compare(ShopItem o1, ShopItem o2) {
            return o1.category.compareTo(o2.category);
        }


        {
            log.info("sort by category");
        }
    }



    static class SortByTitle implements Comparator<ShopItem>{

        @Override
        public int compare(ShopItem o1, ShopItem o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }

        {
            log.info("sort by title");
        }
    }




    static class SortByPrice implements Comparator<ShopItem>{

        @Override
        public int compare(ShopItem o1, ShopItem o2) {
            return o1.priceToString().compareTo(o2.priceToString());
        }

        {
            log.info("sort by price");
        }
    }





    static class SortByQuantity implements Comparator<ShopItem>{
        @Override
        public int compare(ShopItem o1, ShopItem o2) {
            return o1.quantityToString().compareTo(o2.quantityToString());
        }

        {
            log.info("sort by quantity");
        }
    }




}
